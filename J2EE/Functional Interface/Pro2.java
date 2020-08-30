import java.util.ArrayList;
import java.util.Random;



@FunctionalInterface
interface Calculate{
	abstract int add(int a);
}
public class Pro2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Random r=new Random();
		int s=0;
		for(int i=0;i<10;i++) {
		int a=r.nextInt(10);
		al.add(a);}
		Calculate c=(a)->al.stream().filter(x->x>=0).mapToInt(i->i).sum();
		for(Integer n :al)
		{System.out.println(n);
		s=c.add(n);}
		System.out.println(s);

	}

}