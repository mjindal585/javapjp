
import java.util.*;
import java.util.stream.Collectors;


@FunctionalInterface
interface Function{
	abstract String loc(String s);
}
public class Pro1 {
	int id,sal;
	String name,loc;
	public Pro1(int id,String name,int sal,String loc) {
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.loc=loc;
	}
	public String toString() {
		return loc.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pro1> al=new ArrayList<Pro1>();
		al.add(new Pro1(1,"Mithun",123445,"Bangalore"));
		al.add(new Pro1(2,"Shadab",123445,"Bangalore"));
		al.add(new Pro1(3,"Suhas",123445,"Mumbai"));
	
		ArrayList<Pro1> li=(ArrayList<Pro1>) al.stream().filter(str->!str.loc.isEmpty()).collect(Collectors.toList());
		for(Pro1 a:li)
			System.out.println(a.toString());

	}

}
