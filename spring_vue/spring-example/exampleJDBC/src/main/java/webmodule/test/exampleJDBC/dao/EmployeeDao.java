package webmodule.test.exampleJDBC.dao;

import java.util.List;

import webmodule.test.exampleJDBC.dto.Employee;
import webmodule.test.exampleJDBC.dto.EmployeeSearchParam;

public interface EmployeeDao {
	
	/**
	 * 직원일련번호로 직원 정보를 조회
	 * @param empno 직원일련번호
	 * @return 직원정보객체
	 */
	Employee getById(int empno);
	
	/**
	 * 직원이름으로 직원 정보를 조회
	 *  
	 * @param name
	 * @return 검색된 직원 정보 객체의 배열
	 */
	
	List<Employee> searchByName(EmployeeSearchParam param);
	
	/**
	 * 급여를 수정
	 * @param employee
	 * @return
	 */
	int raiseSalary(Employee employee);
	
	/**
	 * 
	 * @param depthName
	 * @return
	 */
	List<Employee> getByDepthName(String depthName);
}
