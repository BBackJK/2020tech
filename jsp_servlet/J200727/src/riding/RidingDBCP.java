package riding;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class RidingDBCP {
	
	// 데이터베이스 연결 변수 선언
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private DataSource ds = null;
	
	
	// JDBC 드라이버 로드
	public RidingDBCP() {
		try {
			InitialContext ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// 데이터베이스 연결 메소드
	public void connect() {
		try {
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 데이터베이스 연결 해제 메소드
	public void disconnect() {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 게시판의 모든 레코드 반환 메소드
	public ArrayList<RidingEntity> getAllList() {
		connect();
		
		ArrayList<RidingEntity> list = new ArrayList<RidingEntity>();
		
		String SQL = "select * from riding";
		
		try {
			pstmt = con.prepareStatement(SQL);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				RidingEntity rider = new RidingEntity();
				
				rider.setId(rs.getInt("id"));
				rider.setTodo(rs.getString("todo"));
				rider.setMaxPerson(rs.getInt("maxPerson"));
				rider.setCurPerson(rs.getInt("curPerson"));
				rider.setMoney(rs.getString("money"));
				rider.setBossChallenger(rs.getString("bossChallenger"));
				rider.setRegDate(rs.getTimestamp("regdate"));
				rider.setContent(rs.getString("content"));
				
				list.add(rider);
			}
			
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NullPointerException ne) {
			ne.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	
	// id에 대한 값을 반환하는 레코드
	public RidingEntity getSelectList(int id) {
		connect();
		String SQL = "select * from riding where id = ?";
		RidingEntity rider = new RidingEntity();
		
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			
			rider.setId(rs.getInt("id"));
			rider.setTodo(rs.getString("todo"));
			rider.setMaxPerson(rs.getInt("maxPerson"));
			rider.setCurPerson(rs.getInt("curPerson"));
			rider.setMoney(rs.getString("money"));
			rider.setBossChallenger(rs.getString("bossChallenger"));
			rider.setRegDate(rs.getTimestamp("regdate"));
			rider.setContent(rs.getString("content"));
			
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return rider;
	}
	
	// 게시물 등록 메소드
	public boolean insertList(RidingEntity rider) {
		boolean success = false;
		
		connect();
		
		String sql = "insert into riding values(0, ?, ?, ?, ?, sysdate(), ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rider.getTodo());
			pstmt.setInt(2, rider.getMaxPerson());
			pstmt.setString(3, rider.getMoney());
			pstmt.setString(4, rider.getBossChallenger());
			pstmt.setString(5, rider.getContent());
			pstmt.executeUpdate();
			
			success=true;
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		} finally {
			disconnect();
		}
		return success;
	}
	
	// 게시물 수정 메소드
	public boolean updateList(RidingEntity rider) {
		boolean success = false;
		
		connect();
		
		String sql = "update riding set todo=?, maxPerson=?, money =?, bossChallenger=?, content=? where id=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, rider.getTodo());
			pstmt.setInt(2, rider.getMaxPerson());
			pstmt.setString(3, rider.getMoney());
			pstmt.setString(4, rider.getBossChallenger());
			pstmt.setString(5, rider.getContent());
			pstmt.setInt(6, rider.getId());
			
			int updated = pstmt.executeUpdate();
			
			if (updated == 1) success = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return success;
	}
	
	// 게시물 삭제를 위한 메소드
	public boolean deleteList(int id) {
		boolean success=false;
		
		connect();
		
		String sql = "delete from riding where id = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			success=true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return success;
	}
	
	// todo 참여 등록 메소드
	public boolean challenge(int id) {
		boolean success = false;
		int curPerson = 0;
		connect();
		
		String selectSQL = "select curPerson from riding where id=?";
		String updateSQL = "update riding set curPerson=? where id=?";
		
		try {
			pstmt = con.prepareStatement(selectSQL);
			
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			
			curPerson = rs.getInt(1);
			
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		if (curPerson > 0) {
			try {
				pstmt = con.prepareStatement(updateSQL);
				
				pstmt.setInt(1, curPerson+1);
				pstmt.setInt(2, id);
				
				int updated = pstmt.executeUpdate();
				
				
				if (updated == 1) success = true;
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			
			return success;
		} 
		
		return success;
	}
}
