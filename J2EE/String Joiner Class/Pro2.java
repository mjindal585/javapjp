import java.util.StringJoiner;


public class Pro2 {

	public static void main(String[] args) {
StringJoiner s1=new StringJoiner("-");
StringJoiner s2=new StringJoiner("-");
	s1.add("Bangalore");
	s1.add("Chennai");
	s1.add("pune");
	s1.add("Mumbai");

	s2.add("Mumbai");
	s2.add("pune");
	s2.add("Chennai");
	s2.add("Bangalore");
	s1.merge(s2);
	System.out.println(s1);
	s2.merge(s1);
	System.out.println(s2);
	}

}