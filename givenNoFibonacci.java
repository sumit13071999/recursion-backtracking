package recursion;
import java.util.*; 
public class givenNoFibonacci {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int fibonacci=fib(n);
System.out.println(fibonacci);
	}
public static int fib(int n)
{
	if(n==1)
	{
		return n;
	}
	if(n==0)
	{
		return n;
	}
	return fib(n-1)+fib(n-2);
}
}
