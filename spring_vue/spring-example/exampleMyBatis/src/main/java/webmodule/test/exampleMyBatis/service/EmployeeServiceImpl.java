package webmodule.test.exampleMyBatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import webmodule.test.exampleMyBatis.mapper.DepartmentMapper;
import webmodule.test.exampleMyBatis.mapper.EmployeeMapper;
import webmodule.test.exampleMyBatis.model.Department;
import webmodule.test.exampleMyBatis.model.Employee;
import webmodule.test.exampleMyBatis.model.EmployeeSearchParam;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Override
	public Employee getEmployee(int empno) {
		// TODO Auto-generated method stub
		
		if (empno <= 0) {
			throw new IllegalArgumentException("고객일련번호가 틀립니다.");
		}
		
		Employee employee = employeeMapper.getById(empno); 
//		Department department = departmentMapper.getDepartmentById(employee.getDeptno());	
		
//		employee.setDepartment(department);
		
		return employee;
	}
	
	@Override
	public List<Employee> searchEmployee(String employeeName, String deptName) {
		// TODO Auto-generated method stub
		
		EmployeeSearchParam param = new EmployeeSearchParam();
		param.setEmployeeName(employeeName);
		param.setDeptName(deptName);
				
		List<Employee> list = employeeMapper.searchByName(param);
		
		return list;
	}
	
	@Override
	public List<Employee> calculateBonus(String depthName, float percent) {
		// TODO Auto-generated method stub
		
		if (StringUtils.isEmpty(depthName) || percent < 0.0f) {
			throw new IllegalArgumentException("지급하고자 하는 부서명과 지급퍼센트 값이 없습니다.");
			
		}
		
		List<Employee> employeeList = employeeMapper.getByDepthName(depthName);
		
		for (Employee employee : employeeList) {
			int resultSalary = Math.round(employee.getSal() * (1 + percent));
			employee.setSal(resultSalary);
			
			employeeMapper.raiseSalary(employee);
		}
		
		return employeeList;
	}
}

