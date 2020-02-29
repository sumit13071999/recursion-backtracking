package recursion;

public class pattern {

	public static void main(String[] args) {
	  pattarn(5,0,0);

	}
	public static void pattarn(int n,int col,int row)
	{
		if(n==row)
			return;
		if(col==row+1)
		{
			col=-1;
			System.out.println();
			pattarn(n,col+1,row+1);
		}else {
			System.out.print("*");
			pattarn(n,col+1,row);
		}
	}

}
