package recursion;
import java.util.*;

public class allindexesproblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[1000];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
	    returnindex(arr,n,m,0);

	}
	public static void returnindex(int arr[],int n,int m,int i)
	{
		if(i==n)
		{
		 return;
		}
		if(arr[i]==m)
		{
			System.out.println(i);
		}
		
		returnindex(arr,n,m,i+1);
	}

}
