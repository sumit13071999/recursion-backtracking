package recursion;

import java.util.Scanner;
//import java.math.*;

public class stringintoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine(); 

		sc.close();
	}
	public static int strintoint(String str)
	{
		if(str.length()==1)
		{
		 return (str.charAt(0) - '0');
		}
	     double y=strintoint(str.substring(1));	
	     double x=str.charAt(0) - '0';
	     x=x*Math.pow(10, str.length()-1)+y;
	     return (int)(x);
	     
	}

}
