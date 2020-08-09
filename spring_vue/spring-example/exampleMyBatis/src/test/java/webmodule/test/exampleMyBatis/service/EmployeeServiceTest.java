package webmodule.test.exampleMyBatis.service;

import static org.assertj.core.api.Assertions.not;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import webmodule.test.exampleMyBatis.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void testGetById() {
		
		int empno = 7369;
		
		Employee employee = employeeService.getEmployee(empno);
		
		assertThat(employee, is(not(nullValue())));
		assertThat(employee.getEmpno(), is(empno));
	}
	
	@Test
	public void testSearchEmployee() {
		
		String employeeName = "ADAMS";
		String deptName = "RESEARCH";
		
		List<Employee> list = employeeService.searchEmployee(employeeName, deptName);
		
		assertThat(list.size(), is(1));
		assertThat(list.get(0).getEname(), equals(employeeName));
		assertThat(list.get(0).getDeptName(), equals(deptName));
	}
//	
//	@Test
//	public void testSearchEmployeeNoParam() {
//		
//		String employeeName = "ADAMS";
//		String deptName = "RESEARCH";
//		
//		List<Employee> list = employeeService.searchEmployee(null, null);
//		
//		boolean isMatched = false;
//		for (Employee item : list) {
//			if (employeeName.equals(item.getEname()) && deptName.equals(item.getDeptName())) {
//				isMatched = true;
//				break;
//			}
//		}
//		
//		assertThat(isMatched, equalTo(true));
//	}
	
	public void testCalculateBonus() {
		int empno = 7369;
		
		Employee employee = employeeService.getEmployee(empno);
		assertThat(employee.getDeptName(), equalTo("RESEARCH"));
		
		int expectedSal = Math.round(employee.getSal() * (1.1f));
		
		employeeService.calculateBonus("RESEARCH", 0.1f);
		
		employee = employeeService.getEmployee(empno);
		assertThat(employee.getDeptName(), equalTo("RESEARCH"));
		assertThat(employee.getSal(), equalTo(expectedSal));
	}
}
