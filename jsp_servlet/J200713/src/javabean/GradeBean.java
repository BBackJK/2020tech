package javabean;

public class GradeBean {
	private String name;
	private int point;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getGrade() {
		String grade = "";
		
		if (this.point >= 90)
			grade = "A";
		else if (this.point >= 80)
			grade = "B";
		else if (this.point >= 70)
			grade = "C";
		else if (this.point >= 60)
			grade = "D";
		else 
			grade = "F";
		return grade;		
	}
	
	// get과 set 다음으로 시작하는 string은 (ex: grade, point) jsp에서 javabean을 이용해 property사용해서 값을
	// 참조할 수 있다
}
