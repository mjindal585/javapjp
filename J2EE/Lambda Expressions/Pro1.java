import java.util.*;


public class Pro1 {

	public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>();
Random r=new Random();
for(int i=1;i<=25;i++)
	al.add(r.nextInt(1000));

System.out.println("Prime numbers:");
al.forEach(
		n->
		{ if(isPrime(n))
			System.out.println(n);
		}
		);
	}
public static boolean isPrime(int n) {
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}
}