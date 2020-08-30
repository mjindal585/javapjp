import java.util.ArrayList;

public class Pro2 {

	public static void main(String[] args) {
ArrayList<String> al=new ArrayList<String>();
al.add("abcd");al.add("de");al.add("i");
al.add("jlkm");al.add("mn");al.add("r");
al.add("stuv");al.add("vw");al.add("z");
al.forEach(
		n->{
			String r="";
				for(int i=n.length()-1;i>=0;i--)
					r=r+n.charAt(i);
				System.out.println(r);
			
		}
		);
	}

}