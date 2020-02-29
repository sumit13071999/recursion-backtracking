package recursion;

import java.util.ArrayList;

public class mazepathdiogonal {

	public static void main(String[] args) {
		System.out.println(mazediogonal(0,0,2,2));

	}
	public static ArrayList<String> mazediogonal(int cr,int cc,int er,int ec)
	{   
		if(cr==er && cc==ec)
		{
			ArrayList<String> bc=new ArrayList<>();
			bc.add("\n");
			return bc;
		}
		if(cr>er || cc>ec)
		{
			ArrayList<String> bc=new ArrayList<>();
			return bc;
		}
		ArrayList<String> mr=new ArrayList<>();
		 ArrayList<String> rr=mazediogonal(cr+1,cc+1,er,ec);
			for(String i:rr)
			mr.add("D" + i);
		 rr=mazediogonal(cr,cc+1,er,ec);
		 for(String i:rr)
		mr.add("H"+i);
		 rr=mazediogonal(cr+1,cc,er,ec);
		 for(String i:rr)
		mr.add("V" + i);
		return mr;
	}

}
