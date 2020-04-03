import java.util.Iterator;
import java.util.TreeSet;

public class Pro3 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Mohit");
		set.add("Jindal");
		set.add("Alice");
        set.add("Richard");
        
        System.out.println("Original tree set:" + set);  
        Iterator it = set.descendingIterator();
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
		
		Iterator<String> it1 = set.iterator();
		String query = "John";
		boolean result = false;
		
		while (it1.hasNext()) {
			if (it1.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}

}