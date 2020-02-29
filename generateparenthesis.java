package recursion;
import java.util.*;
public class generateparenthesis {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
       ArrayList<String> ans= generateParenthesis(n);
       String []arr=new String[ ans.size()];
      arr= ans.toArray(arr);
     //  for(String i:arr)
    	//   System.out.println(i);
      printArray(arr,0);
	}
	public static void printArray(String[] arr,int n)
	{
     if(n==arr.length)
	 {
		 return;
	 }
	 printArray(arr,n+1);
	 System.out.println(arr[n]);
	}
	public static ArrayList<String> generateParenthesis(int n) {
	    ArrayList<String> solutions = new ArrayList<String>();
	    recursion(n, new String(), solutions);
	    return solutions;
	}

	private static void recursion(int n, String str, ArrayList<String> sol) {
	    if(str.length() == 2 * n)
	        sol.add(str);
	    else {
	        int left = 0;
	        int right = 0;
	        for(int i = 0; i < str.length(); ++i) {
	            if(str.charAt(i) == '(')
	                left++;
	            if(str.charAt(i) == ')')
	                right++;
	        }
	        if(left == right)
	            recursion(n, str + "(", sol);
	        else if(right < left) {
	            if(left < n)
	                recursion(n, str + "(", sol);
	            recursion(n, str + ")", sol);
	        }
	    }
	}
}
