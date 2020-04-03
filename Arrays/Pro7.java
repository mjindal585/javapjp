 
import java.util.Arrays; 

public class Pro7{ 
	public static void main(String[] args) 
	{ 
		int[] arr = {13, 7, 6, 45, 21,10 , 10 ,13,101,102,103,9,6,7, 9, 101, 102}; 

        Arrays.sort(arr); 
        int n = arr.length;  

        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  

        for (int i=0; i<j; i++)  
            System.out.print(arr[i]+" "); 
	} 
} 
