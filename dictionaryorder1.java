package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class dictionaryorder1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		ArrayList<String> my=getpermutation(str);
		for(String i:my)
		{
			if(str.compareTo(i)<0)
				System.out.println(i);
		}

	}
	public static ArrayList<String> getpermutation(String p)
	{   
		if(p.length()==0)
		{
			ArrayList<String> bc=new ArrayList<>();
			bc.add("");
			return bc;
		}
		ArrayList<String> mr=new ArrayList<>();
		String cs=p.substring(0, 1);
		String rs=p.substring(1);
		ArrayList<String> rr=getpermutation(rs);
		for(String i:rr)
		{
			for(int j=0;j<=i.length();j++)
			{
				mr.add(i.substring(0,j) + cs +i.substring(j));
			}
		}
		return mr;
	}

}
