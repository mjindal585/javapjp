import java.util.ArrayList;
import java.util.StringJoiner;


public class Pro1 {

	public static void main(String[] args) {
StringJoiner s=new StringJoiner(",","{","}");
ArrayList <String> li=new ArrayList<String>();
li.add("Mithun");
li.add("Shadab");
li.add("Suhas");

li.forEach(a->s.add(a));
System.out.println(s);
	}

}