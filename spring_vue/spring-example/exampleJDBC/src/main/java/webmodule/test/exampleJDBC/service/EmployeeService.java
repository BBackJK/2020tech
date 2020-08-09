package webmodule.test.exampleJDBC.service;

import java.util.List;

import webmodule.test.exampleJDBC.dto.Employee;

public interface EmployeeService {
	
	
	/**
	 * 고객 일련번호로 고객 정보를 가져온다.
	 * @param empno
	 * @return
	 */
	Employee getEmployee(int empno);
	
	/**
	 * 직원이름과 소속부서이름으로 직원정보 목록을 조회
	 * 검색조건이 비어있으면 전체 목록을 반환한다.
	 * @param employeeName 직원이름
	 * @param deptName	직원정보
	 * @return	직원정보목록
	 */
	List<Employee> searchEmployee(String employeeName, String deptName);
	
	
	/**
	 * 보너스를 계산하고 급여에 반영된다.
	 * 부서를 입력받아 입력받을 퍼센트만큼 보너스로 계산한다.
	 * 
	 * 보너스를 지급받은 직원들의 목록을 반환한다.
	 */
	List<Employee> calculateBonus(String depthName, float percent);
}
