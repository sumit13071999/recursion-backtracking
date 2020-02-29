package recursion;

import java.util.Scanner;

public class pi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
	     String str=sc.nextLine();
		 System.out.println(pi(str,0));
		}
	    }
public static String pi(String str,int virindex)
{
	if(virindex==str.length()-1)
		return str;
	if(str.charAt(virindex)=='p' && str.charAt(virindex+1)=='i')
	{
		str=str.substring(0,virindex)+"3.14"+str.substring(virindex+2);
	}
	String res=pi(str,virindex+1);
	return res;
}
}
