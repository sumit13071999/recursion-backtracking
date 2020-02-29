package recursion;

import java.util.ArrayList;

public class subsequencestring {

	public static void main(String[] args) {
		System.out.println(getss("abc"));

	}
	public static ArrayList<String> getss(String ss)
	{
		if(ss.length()==0)
		{
			ArrayList<String> bc=new ArrayList<>();
			bc.add(" \n");
			return bc;
		}
		ArrayList<String> mr=new ArrayList<>();
		String cs=ss.substring(0,1);
		String rs=ss.substring(1);
		ArrayList<String> rr=getss(rs);
		for(String i:rr)
			mr.add(i);
		for(String i:rr)
			mr.add(cs + i);
			
		return mr;
	}

}
