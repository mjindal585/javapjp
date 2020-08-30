import java.util.ArrayList;


public class Pro1 {

	public static void main(String[] args) {
ArrayList<String> al=new ArrayList<String>();
al.add("Mon");al.add("Tue");al.add("Wed");al.add("Thur");
al.add("Fri");al.add("Sat");al.add("Sun");
al.forEach(
		l->System.out.println(l));
	}

}