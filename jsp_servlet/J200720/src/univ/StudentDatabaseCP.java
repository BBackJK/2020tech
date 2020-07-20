package univ;

import java.sql.*;
import java.util.ArrayList;
import javax.sql.*;
import javax.naming.*;

public class StudentDatabaseCP {
	
		// 데이터베이스 연결 관련 상수 선언
		private static final String DATA_SOURCE_PATH="java:comp/env/jdbc/mysql";
		
		
		// 데이터베이스 연결 관련 변수 선언
		private Connection con = null;
		private PreparedStatement pstmt = null;
		private DataSource ds = null;
		
		
		// 등록한 DBCP 데이터 소스를 찾아 저장하는 생성자
		public StudentDatabaseCP() {
			try {
				InitialContext ctx = new InitialContext();
				ds = (DataSource) ctx.lookup(DATA_SOURCE_PATH);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 데이터베이스 연결 메소드
		public void connect() {
			try {
				// 데이터베이스에 연결, Connection 객체 저장
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
		
		
		// 게시판 모든 레코드를 반환하는 메소드  
		public ArrayList<StudentEntity> getStudentList() {
			connect();
			
			// 질의 결과를 저장할 ArrayList를 선언
			// ArrayList 내부에는 학생정보를 저장한 StudentEntity가 삽입
			ArrayList<StudentEntity> list = new ArrayList<StudentEntity>();
			
			String SQL = "select * from student";
			
			try {
				pstmt = con.prepareStatement(SQL);
				ResultSet rs = pstmt.executeQuery();
				
				// ResultSet의 결과에서 모든 행을 각각의 StudentEntity 객체의 저장  
				
				while (rs.next()) {
					
					// 한 행의 학생 정보를 저장할 학생을 위한 빈즈 객체 생성
					StudentEntity stu = new StudentEntity();
					
					stu.setId(rs.getString("id"));
					stu.setPasswd(rs.getString("passwd"));
					stu.setName(rs.getString("name"));
					stu.setYear(rs.getInt("year"));
					stu.setSnum(rs.getString("snum"));
					
					// ArrayList에 학생정보 StudentEntity 객체를 추가
					list.add(stu);
				}
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			
			return list;
		}
}
