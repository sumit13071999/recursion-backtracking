package recursion;

import java.util.Scanner;

public class sodukusolver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int board[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				board[i][j]=sc.nextInt();
			}
		}
		System.out.println(sudokusolver(board,n));
		printboard(board,n);

	}
	public static void printboard(int board[][],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
public static boolean sudokusolver(int board[][],int n)
{
	int row=-1;
	int col=-1;
	
	boolean isempty=false;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(board[i][j]==0)
			{
				isempty=true;
				row=i;
				col=j;
				break;
			}
		}
		if(isempty)
			break;
	}
	if(!isempty)
	return true;
	
	for(int num=1;num<=n;num++)
	{
		if(canplaceNum(board,row,col,num,n))
		{
			board[row][col]=num;
			if(sudokusolver(board,n))
				return true;
			board[row][col]=0;
		}
	}
	return false;
}
public static boolean canplaceNum(int board[][],int row,int col,int num,int n)
{
	for(int i=0;i<n;i++)
	{
	if(board[i][col]==num)
		return false;
	}
	for(int i=0;i<n;i++)
	{
		if(board[row][i]==num)
			return false;
	}
	int rowstart=row-row%(int) Math.sqrt(n);
	int colstart=col-col%(int)Math.sqrt(n);
	for(int i=rowstart;i<rowstart+(int)Math.sqrt(n);i++)
	{
		for(int j=colstart;j<colstart+(int)Math.sqrt(n);j++)
		{
			if(board[i][j]==num)
				return false;
		}
	}
	return true;
}
}
