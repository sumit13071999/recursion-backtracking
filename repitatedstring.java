package recursion;

import java.util.Scanner;

public class repitatedstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
        String str1 ="";
        int n=0;
        repeatation(str,str1);
	}
public static void repeatation(String str,String str1) 
{  
	char a=str.charAt(0);
	if(str.length()==1)
{  
		str1=str1+a;
	System.out.println(str1);
	return;
}
	char b=str.charAt(1);
	if(a==b)
	{
	 str1=str1+a;
	 str1=str1+"*";
	}else
	{
		str1=str1+a;
	}
	repeatation(str.substring(1),str1);
	
}
}
