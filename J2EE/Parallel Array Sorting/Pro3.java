import java.util.Arrays;
import java.util.Random;


public class Pro3 {

	public static void main(String[] args) {
		int n=10;
		int[] a=new int[n];
		Random r=new Random();
		for(int i=0;i<n;i++)
			a[i]=r.nextInt(n);
		System.out.println("Array before sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		Arrays.parallelSort(a,0,5);
		System.out.println();
		System.out.println("Array after sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}

}