import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Pro7 {
	public static boolean evenodd(int n)
	{
		if(n%2==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Random r=new Random();
		for(int i=0;i<10;i++) {
		int a=r.nextInt(10);
		al.add(a);}
		Consumer<Integer> c1=i->System.out.println(i+" even");
		Consumer<Integer> c2=i->System.out.println(i+" odd");
		Consumer<List<Integer>> c3=x->{
			for(int i=0;i<x.size();i++)
			{
				if(evenodd(x.get(i))==true)
					c1.accept(x.get(i));
				else
					c2.accept(x.get(i));
			}
		};
		c3.accept(al);
		
	}

}