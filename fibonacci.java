package recursion;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
	int a=fib(i);
	System.out.println(a);
}	}
public static int fib(int n)
{
	if(n==0)
		return 0;
	if(n==2 || n==1)
	{
		return 1; 
	}
	return fib(n-1)+fib(n-2);
}
}
