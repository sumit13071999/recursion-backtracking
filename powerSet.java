package recursion;
import java.util.Scanner;
public class powerSet {
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		sc.close();
		set( x,n,1);
		System.out.println(set( x,n,1));

			}
		public static int set(int x,int n,int a)
		{
			int num=(int)Math.pow(a, n);
			if(num>x)
			{
				return 0;
			}
			if(num==x)
			{
				return 1;
			}
			int b= set(x,n,a+1);
					
			int c=set(x-num,n,a+1);
			return b+c;
		}
}
