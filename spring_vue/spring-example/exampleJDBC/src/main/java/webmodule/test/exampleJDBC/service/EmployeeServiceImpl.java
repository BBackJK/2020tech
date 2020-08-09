package webmodule.test.exampleJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import webmodule.test.exampleJDBC.dao.EmployeeDao;
import webmodule.test.exampleJDBC.dto.Employee;
import webmodule.test.exampleJDBC.dto.EmployeeSearchParam;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Employee getEmployee(int empno) {
		// TODO Auto-generated method stub
		
		if (empno <= 0) {
			throw new IllegalArgumentException("고객일련번호가 틀립니다.");
		}
		
		Employee employee = employeeDao.getById(empno); 
				
		return employee;
	}

	@Override
	public List<Employee> searchEmployee(String employeeName, String deptName) {
		// TODO Auto-generated method stub
		
		// employeeDao.searchByName(employeeName, deptName); 도 가능하지만 DAO는 DTO를 하나만 받는것을 원칙으로 한다.
		// 따라서 search param이라는 것을 생성해야 한다.
		
		EmployeeSearchParam param = new EmployeeSearchParam();
		param.setEmployeeName(employeeName);
		param.setDeptName(deptName);
				
		List<Employee> list = employeeDao.searchByName(param);
		
		return list;
	}

	@Override
	public List<Employee> calculateBonus(String depthName, float percent) {
		// TODO Auto-generated method stub
		
		if (StringUtils.isEmpty(depthName) || percent < 0.0f) {
			throw new IllegalArgumentException("지급하고자 하는 부서명과 지급퍼센트 값이 없습니다.");
			
		}
		
		List<Employee> employeeList = employeeDao.getByDepthName(depthName);
		
		for (Employee employee : employeeList) {
			int resultSalary = Math.round(employee.getSal() * (1 + percent));
			employee.setSal(resultSalary);
			
			employeeDao.raiseSalary(employee);
		}
		
		return employeeList;
	}

}
