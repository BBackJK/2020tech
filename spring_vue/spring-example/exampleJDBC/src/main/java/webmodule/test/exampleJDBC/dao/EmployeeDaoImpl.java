package webmodule.test.exampleJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import webmodule.test.exampleJDBC.dto.Employee;
import webmodule.test.exampleJDBC.dto.EmployeeSearchParam;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Employee getById(int empno) {
		String sql = "SELECT a.empno AS empno,\r\n" + 
					"	a.ename AS ename,\r\n" + 
					"	a.job AS job,\r\n" + 
					"	a.hiredate AS hiredate,\r\n" + 
					"	a.sal AS sal,\r\n" + 
					" 	a.dname AS dname \r\n" +
					"FROM emp a JOIN dept b ON a.deptno =b.deptno\r\n" + 
					"WEHRE a.empno = ?";
		
		Employee resultEmployee = jdbcTemplate.queryForObject(sql, new Object[] {empno}, new EmployeeRowMapper());
		return resultEmployee;
	}
	
	@Override
	public List<Employee> searchByName(EmployeeSearchParam param) {
		
		String sql = "SELECT a.empno AS empno,\r\n" + 
				"	a.ename AS ename,\r\n" + 
				"	a.job AS job,\r\n" + 
				"	a.hiredate AS hiredate,\r\n" + 
				"	a.sal AS sal,\r\n" + 
				" 	a.dname AS dname \r\n" +
				"FROM emp a JOIN dept b ON a.deptno =b.deptno\r\n" + 
				"WHERE 1 = 1 \r\n";
			
		Object[] params = null;
		if (param == null) {
			params = new Object[] {};
		} else {
			List<Object> paramList = new ArrayList<Object>();
			if (StringUtils.isEmpty(param.getEmployeeName())) {
				paramList.add(param.getEmployeeName());
				sql += "AND a.ename LIKE concat(?, '%')\r\n";
			}
			
			if (StringUtils.isEmpty(param.getDeptName())) {
				paramList.add(param.getDeptName());
				sql += "AND b.dname LIKE concat(?, '%')\r\n";
			}
			
			params = paramList.toArray(new Object[] {});
		}
		
		List<Employee> result = jdbcTemplate.query(sql, new EmployeeRowMapper(), params); 
		
		return result;
	}
	
	@Override
	public int raiseSalary(Employee employee) {
		
		String sql = "UPDATE emp SET sal = ? WHERE empno = ?";
		
		int affected = jdbcTemplate.update(sql, employee.getSal(), employee.getEmpno());
		
		return affected;
	};
	
	@Override
	public List<Employee> getByDepthName(String depthName) {
		
		String sql = "SELECT a.empno AS empno,\r\n" + 
				"	a.ename AS ename,\r\n" + 
				"	a.job AS job,\r\n" + 
				"	a.hiredate AS hiredate,\r\n" + 
				"	a.sal AS sal,\r\n" + 
				" 	a.dname AS dname \r\n" +
				"FROM emp a JOIN dept b ON a.deptno =b.deptno\r\n" + 
				"WHERE b.dname = ? \r\n";
		
		List<Employee> result = jdbcTemplate.query(sql, new EmployeeRowMapper(), new Object[] {depthName});
		
		return result;
	}
	
	public class EmployeeRowMapper implements RowMapper<Employee> {
		
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Employee employee = new Employee();
			
			employee.setEmpno(rs.getInt("empno"));
			employee.setEname(rs.getString("ename"));
			employee.setJob(rs.getString("job"));
			employee.setHiredate(new Date(rs.getDate("hiredate").getTime()));
			employee.setSal(rs.getInt("sal"));
			employee.setDeptName(rs.getString("dname"));
			return employee;
		}
	}
}
