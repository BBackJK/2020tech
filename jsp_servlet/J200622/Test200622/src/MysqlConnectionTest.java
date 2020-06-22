import java.sql.*;

public class MysqlConnectionTest {
	
	private final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private final static String DB_URL = "jdbc:mysql://localhost/test?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
	
	private final static String USERNAME = "root";
	private final static String PASSWORD = "test";
	
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement state = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			
			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			System.out.println(conn.toString());
			
			state = conn.createStatement();
			
			String sql;
			sql = "SELECT * FROM student";
			ResultSet rs = state.executeQuery(sql);
			
			
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int year = rs.getInt("year");
				String dept = rs.getString("dept");
				
				System.out.println("ID: " + id + "\nName: " + name + "\nYear: " + year + "\nDept: " + dept);
			}
			
			rs.close();
			state.close();
			conn.close();
			
		} catch (Exception e) {
//			System.out.println("SQLException: " + e.getMessage());
//			System.out.println("SQLState: " + e.getSQLState());
//			System.out.println("VenderError: " + e.getErrorCode());
		} finally {
			try {
				if (state!=null) state.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if (conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("MYSQL close");
		
	}
}
