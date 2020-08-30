
import java.util.Arrays;
import java.util.Scanner;


public class Pro2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("Enter input:");
		String s=in.nextLine();
		int n=s.length();
		char a[]=s.toCharArray();
		s="";
		System.out.println("Before sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		Arrays.parallelSort(a);
		System.out.println("\nAfter soring:");
		for(int i=0;i<n;i++)
			{ System.out.print(a[i]+" ");
				s+=String.valueOf(a[i]);}
		System.out.println("\nString value: "+s);
		in.close();

	}

}