package bean;

import java.util.List;

public class Test {
private List<String> testId;
private List<String> testTitle;
private List<Integer> marks;
public Test(List<String> testId, List<String> testTitle, List<Integer> marks) {
	super();
	this.testId = testId;
	this.testTitle = testTitle;
	this.marks = marks;
}
public Test() {
	super();
	// TODO Auto-generated constructor stub
}
public List<String> getTestId() {
	return testId;
}
public void setTestId(List<String> testId) {
	this.testId = testId;
}
public List<String> getTestTitle() {
	return testTitle;
}
public void setTestTitle(List<String> testTitle) {
	this.testTitle = testTitle;
}
public List<Integer> getMarks() {
	return marks;
}
public void setMarks(List<Integer> marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Test [testId=" + testId + ", testTitle=" + testTitle + ", marks=" + marks + "]";
}

}
