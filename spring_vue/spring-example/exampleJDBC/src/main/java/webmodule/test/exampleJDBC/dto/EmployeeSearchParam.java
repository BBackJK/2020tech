package webmodule.test.exampleJDBC.dto;

public class EmployeeSearchParam {
	private String employeeName;	// 직원 이름
	private String deptName;		// 소속부서이름
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
