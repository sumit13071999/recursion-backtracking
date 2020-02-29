package recursion;

import java.util.Scanner;

public class smartkeypad {
 static	String table[] = { " ", ".+@$", "abc", "def", "ghi", 
			"jkl" , "mno", "pqrs" , "tuv", "wxyz" };

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
         keypad(n,"");
	}
public static void keypad(String n,String ans)
{ if(n.length()==0)
	
{
	System.out.print(ans+" ");
	return;
}
 char ch=n.charAt(0);
 String ros=n.substring(1);
 String code=table[ch-'0'];
 for(int i=0;i<code.length();i++)   
	keypad(ros,ans+code.charAt(i));
	
}
}
