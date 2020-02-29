package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class permutationstring {
	// permutation with sorted String and lexicographic order

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	ArrayList<String> a=	getpermutation(sc.nextLine());
      ArrayList<String> b=replaceduplicate(a,0);
      String c[]=new String[b.size()];
      c=b.toArray(c);
       printArray(c);
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
	public static ArrayList<String> replaceduplicate(ArrayList<String> list,int counter)
	{ 

	    if(counter < list.size()){
	        if(list.contains(list.get(counter))){
	            list.remove(list.lastIndexOf(list.get(counter)));
	        }
	        replaceduplicate(list, ++counter);
	    }
		return list;
	}
public static void	printArray(String []words)
{
	for(int i = 0; i < words.length; ++i) {
        for (int j = i + 1; j < words.length; ++j) {
            if (words[i].compareTo(words[j]) > 0) {

                // swap words[i] with words[j[
                String temp = words[i];
                words[i] = words[j];
                words[j] = temp;
            }
        }
    }

   // System.out.println("In lexicographical order:");
    for(int i = 0; i < words.length; i++) {
        System.out.println(words[i]);
    }
}
}


