package recursion;

import java.util.Scanner;

public class gamestategy {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	 for(int i=0;i<n;i++)
		 arr[i]=sc.nextInt();
     System.out.println( game(arr,n));
	}
	 static int game(int[] arr, int n)  
	    {  
	        int sum = 0;  
	        for(int i = 0; i < n; i++) 
	        { 
	            sum += arr[i]; 
	        } 
	  
	        return oSRec(arr, 0, n - 1, sum);  
	    }
	 static int oSRec(int []arr, int i, int j, int sum)  
	    {  
	        if (j == i + 1)  
	            return Math.max(arr[i], arr[j]);  
	        return Math.max((sum - oSRec(arr, i + 1, j, sum - arr[i])),  
	                (sum - oSRec(arr, i, j - 1, sum - arr[j])));  
	    }  
}
