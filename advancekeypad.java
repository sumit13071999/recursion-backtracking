package recursion;

import java.util.Scanner;

public class advancekeypad {
	static String searchIn [] = {
            "prateek", "sneha", "deepak", "arnav", "shikha", "palak",
            "utkarsh", "divyam", "vidhi", "sparsh", "akku"
    };
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
		matchstring(ans,"",0);
		
		return;
	}
	 char ch=n.charAt(0);
	 String ros=n.substring(1);
	 String code=table[ch-'0'];
	 for(int i=0;i<code.length();i++)   
		keypad(ros,ans+code.charAt(i));
		
	}
	public static void matchstring(String str,String a,int i)
	{
	a=searchIn[i];
	if(searchIn.length==i-1)
	{
		return;
	}
	int k=0;
	for(int j=0;j<a.length()-1;j++)
	{
		char b=str.charAt(j);
		char c=a.charAt(k);
		if(b==c)
		{
			for(int l=1;l<str.length()-1;l++)
			{
			char d=str.charAt(l);
			char e=a.charAt(j+1);
			
			}
		}
	}
		matchstring(str,a,i+1);
	}

}
