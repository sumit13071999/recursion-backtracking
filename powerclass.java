package recursion;

public class powerclass {

	public static void main(String[] args) {
		int x=3,n=4;
		System.out.println(power(x,n));

	}
	public static int power(int x,int n)
	{
		if(n==0)
			return 1;
		int result=power(x,n-1);
		 result=result*x;
		return result;
		
	}

}
