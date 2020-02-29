package recursion;

public class printsubstring {

	public static void main(String[] args) {
		substring("abc","");

	}
	public static void substring(String str,String result)
	{
		if(str.length()==0)
		{
			System.out.println(result);
			return;
		}
		char cs=str.charAt(0);
		String roq=str.substring(1);
		substring(roq,result);
		substring(roq,result+cs);
	}

}
