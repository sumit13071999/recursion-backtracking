package recursion;

public class coinpermutation {
	static int count;

	public static void main(String[] args) {
		coinper(new int[] {2,3,5,6},10,"");

	}

	public static void coinper(int[] arr, int remaining, String ans) {
	
		if(remaining==0)
		{
			count++;
			System.out.println(count+"."+ans);
			return;
		}
		if(remaining<0)
			return;
		for(int i=0;i<arr.length;i++)
		coinper(arr,remaining-arr[i],ans+arr[i]);
	}

}
