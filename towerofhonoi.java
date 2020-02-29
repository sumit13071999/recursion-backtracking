package recursion;

import java.util.Scanner;

public class towerofhonoi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TowerofHonoi(n,'A','B','C');

	}
	public static void TowerofHonoi(int n,char src,char dest,char helper)
	{
		if(n==0)
		{
			return;
		}
		TowerofHonoi(n-1,src,helper,dest);
		System.out.println("moving ring "+n+" from "+src+" to "+dest);
		TowerofHonoi(n-1,helper,dest,src);
	}

}
