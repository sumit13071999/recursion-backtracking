package recursion;

public class printpermutation {

	public static void main(String[] args) {
		permutation("abcde","");

	}
	public static void permutation(String str,String result)
	{ 
		if(str.length()==0)
		{
			System.out.println(result);
			return ;
		}
		for(int i=0;i<=str.length()-1;i++)
		{
		char cs=str.charAt(i);
		String roq=str.substring(0,i) + str.substring(i+1);
		permutation(roq,result+cs);
	}
	}

}
