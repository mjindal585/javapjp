import java.util.Arrays;
import java.util.Random;


public class Pro1 {

	public static void main(String[] args) {
		int n=10;
		int[] a=new int[n];
		Random r=new Random();
		for(int i=0;i<n;i++)
			a[i]=r.nextInt(n);
		System.out.println("Array before sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		Arrays.parallelSort(a);
		System.out.println();
		System.out.println("Array after sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println("\nSum of min and max value is:"+(a[0]+a[n-1]));
	}

}