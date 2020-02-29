package recursion;

import java.util.ArrayList;

public class boardpath {

	public static void main(String[] args) {
		ArrayList<String> mylist=new ArrayList<>();
	 //  mylist.addAll(getboard(0,10));
	   //System.out.println(mylist);
        System.out.println(getmazepath(0,0,2,2));
	}
	public static ArrayList<String> getboard(int s,int end)
	{    
		if(s==end)
		{
			ArrayList<String> bc=new ArrayList<>();
			bc.add("\n");
			return bc;
		}
		if(s>end)
		{
			ArrayList<String> bc=new ArrayList<>();
			return bc;
		}
		ArrayList<String> myarr=new ArrayList<>();
	     for(int i=1;i<=6;i++)
	     {
	    	 ArrayList<String> rr=getboard(s+i,end);
	    	 for(String j:rr)
			myarr.add(i + j);
	    	 
	     }
	     return myarr;
	}
public static ArrayList<String> getmazepath(int cr,int cc,int er,int ec)
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
ArrayList<String> rr=getmazepath(cr,cc+1,er,ec);
for(String i:rr)
mr.add("H"+i);
      rr=getmazepath(cr+1,cc,er,ec);
      for(String i:rr)
    	  mr.add("V"+i);
return mr;
}
}