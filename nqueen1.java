package recursion;

public class nqueen1 {
	 static int count=0;

	public static void main(String[] args) {
		int n=4;
		int board[][]=new int [n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				board[i][j]=0;
			}
		}
		if(findsol(board,0,4)==false)
			System.out.println("no solution exist:");
		System.out.println(count);
		//printboard(board);

	}
	private static void printboard(int[][] board) {
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static boolean  findsol(int board[][],int col,int n)
	{
		if(n==col)
		{
			count++;
			printboard(board);
			return true;
		}
		if(col>=4)
			return true;
		for(int i=0;i<4;i++)
		{
			if(isplacequeen(board,i,col)==true) {
				board[i][col]=1;
			if(findsol(board,col+1,n)==true)
				return true;
			board[i][col]=0;
		}
		}
	return false;
	}
	public static boolean isplacequeen(int board[][],int row,int col)
	{
		for(int i=0;i<col;i++)
			if(board[row][i]==1)return false;
		for(int i=row,j=col;i>=0 && j>=0;i--,j--)
			if(board[i][j]==1)return false;
		for(int i=row,j=col;j>0 && i<4;i++,j--)
			if(board[i][j]==1)return false;
		return true;
	}
	

}
