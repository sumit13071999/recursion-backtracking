package recursion;
import java.util.*;
public class ratInMaze {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int maze[][]=new int[n][n];
      for(int i=0;i<n;i++)
      {
    	  for(int j=0;j<n;j++)
    	  {
    		  maze[i][j]=sc.nextInt();
    	  }
      }
      ratinmaze(maze,n);

	}
   public static void ratinmaze(int maze[][],int n)
   {
	   int solution[][]=new int[n][n];
	 //  for(int i=0;i<n;i++)
		//   solution[i]=new int[n];
	//   System.out.println(solution);
	   mazehelp(maze,n,solution,0,0);
   }
   public static void mazehelp(int maze[][],int n,int[][] solution,int x,int y)
   {
	   if(x==n-1 && y==n-1)
	   {
		   solution[x][y]=1;
		   printsolution(solution,n);
		   return;
	   }
	   if(x>=n || x<0 || y>=n || y<0 || maze[x][y]==0 || solution[x][y]==1)
	   {
		   return;
	   }
	   solution[x][y]=1;
	   mazehelp(maze,n,solution,x-1,y);
	   mazehelp(maze,n,solution,x+1,y);
	   mazehelp(maze,n,solution,x,y-1);
	   mazehelp(maze,n,solution,x,y+1);
	   solution[x][y]=0;
   }
   public static void printsolution(int [][]solution,int n)
   {
	   for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<n;j++)
		   {
			   System.out.print(solution[i][j]);
		   }
		   System.out.println();
	   }
	  // System.out.println("-----------------------------------");
   }

}
