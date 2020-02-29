package recursion;

import java.util.Scanner;

public class queenperpermutation {
 static int count=0;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of queens:");
	int n=sc.nextInt();
	System.out.println("enter the board no:");
	int a=sc.nextInt();
    boolean board[]=new boolean[a];
	permutationQueens(board,0,n,"");
System.out.println(count);
	}
public static void permutationQueens(boolean []board,int queenNo,int n,String ans)
{
	if(n==queenNo)
	{
		System.out.println(ans);
		count++;
		return;
	}
	for(int i=0;i<board.length;i++)
	{
		if(board[i]==false)
		{
			board[i]=true;
			permutationQueens(board,queenNo+1,n,ans+"q"+queenNo+"b"+i+" ");
		board[i]=false;
		}
	}
}
}
