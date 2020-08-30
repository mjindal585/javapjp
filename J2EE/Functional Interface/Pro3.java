import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class pal implements Predicate<String>{
	@Override
	public boolean test(String arg0) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder(arg0);
		String s=sb.reverse().toString();
		if(s.equals(arg0))
			return true;
		else
			return false;
	}

}
public class Pro3  {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("abb");
		
		al.add("kanak");
		pal b=new pal();
		List <String> li=al.stream().filter(b).collect(Collectors.toList());
		for(String a:li)
			System.out.println(a.toString());
	}

	
}