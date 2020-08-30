import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


 /* Given an ArrayList containing 10 numbers, write a program to filter the perfect square numbers.
Example for perfect square numbers: 0, 1, 4, 9, 16, 25, 36, 49, 64 etc..*/

/*class Findsqrt implements <Object>
{
	
	@Override
	public boolean test(Object t) {
		// TODO Auto-generated method stub
		return false;
	}
}*/
public class Pro5 implements Predicate<Integer>  {
	private double n;
	public Pro5(double n)
	{
		this.setN(n);
	}
	public static void main(String[] args) {
		ArrayList<Pro5> al=new ArrayList<Pro5>();
		
		//Random r=new Random();
		/*
		 * for(int i=0;i<10;i++) { int a=r.nextInt(10); al.add(a); }
		 */
		al.add(new Pro5((double) 63));
		al.add(new Pro5((double) 49));
		al.add(new Pro5((double) 4));
		
		
		List<Pro5> li=al.stream().filter(n->{
			 
					for(int i=0;i*i<=n.getN();i++)
					{
						if(n.getN()%i==0 && n.getN()/i==i)
							return true;
					}
					return false;
				
		}).collect(Collectors.toList()) ;
		for(Pro5 a:li)
			System.out.println(a.getN());
	}
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}
	@Override
	public boolean test(Integer t) {
		return false;
	}


}