
public class CollegeStudent extends Student {
	private int year;
	private String major;
	public CollegeStudent(String name ,int roll,int year,String major) {
		super(name , roll);
		this.year = year;
		this.major = major;
	}
	@Override
	public String toString() {
		return "CollegeStudent [year=" + year + "Major=" + major +" ]";
	}
}
