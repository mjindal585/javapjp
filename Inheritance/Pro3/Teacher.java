
public class Teacher extends Person {
	private int salary;
	private String subject;

	public Teacher(String name, int salary,String subject) {
		super(name);
		this.salary = salary;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [salary=" + salary + " Subject=" + subject+ "]";
	}
}
