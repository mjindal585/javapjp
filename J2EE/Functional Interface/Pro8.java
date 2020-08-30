import java.util.ArrayList;
import java.util.function.Supplier;


public class Pro8 implements Supplier<Integer> {
public static boolean isPrime(int n)
{
	for(int i=2;i<n;i++)
		if(n%i==0 || n==1 ||n==0)
			return false;
	return true;
}
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		int n=0;
		Supplier<Integer> s1=()->{
			return (int) (Math.random()*100);
			};
			for(int i=0;n<10;i++) {
				int m=s1.get();
			if(isPrime(m))
					al.add(m);
			n=al.size();
		}
		al.forEach(System.out::println);
	}

	public Integer get() {return null;}

}