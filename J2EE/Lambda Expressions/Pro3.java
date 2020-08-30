import java.util.ArrayList;

public class Pro3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("abcd");al.add("de");al.add("ijk");
        al.add("jlkm");al.add("mn");al.add("r");
        al.add("stuv");al.add("vw");al.add("za");
		al.forEach(
				n->{
					if(n.length()%2!=0)
						System.out.println(n);
					
				}
				);
	}
}