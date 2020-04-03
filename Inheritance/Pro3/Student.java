
public class Student extends Person {
	private int roll;
	public Student(String name, int roll) {
		super(name);
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + roll + "]";
	}
}
