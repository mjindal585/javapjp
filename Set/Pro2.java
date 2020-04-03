import java.util.HashSet;
import java.util.Iterator;

public class Pro2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Mohit");
		set.add("Jindal");
		set.add("Alice");
		set.add("Richard");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}