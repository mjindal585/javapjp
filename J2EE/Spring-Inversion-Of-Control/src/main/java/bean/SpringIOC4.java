package bean;

import java.util.List;

 class SpringIOC4 {
	//public class Student
	private List<String> studentId;
	private List<String> studentName;
	private Test t;
	public SpringIOC4(List<String> studentId, List<String> studentName, Test t) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.t = t;
	}
	public SpringIOC4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getStudentId() {
		return studentId;
	}
	public void setStudentId(List<String> studentId) {
		this.studentId = studentId;
	}
	public List<String> getStudentName() {
		return studentName;
	}
	public void setStudentName(List<String> studentName) {
		this.studentName = studentName;
	}
	public Test getT() {
		return t;
	}
	public void setT(Test t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "SpringIOC4 [studentId=" + studentId + ", studentName=" + studentName + ", t=" + t + "]";
	}

}
