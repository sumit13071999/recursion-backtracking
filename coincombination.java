package recursion;

public class coincombination {
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,5,6,4,7,8,9};
		coincombination(arr,100,"",0);
      	}
	public static void coincombination(int[] arr,int remaining,String ans,
			int lastindex)
	{
		if(remaining==0)
		{
			System.out.println(ans);
			return;
		}
		if(remaining<arr[lastindex])
			return;
		for(int i=lastindex;i<arr.length-1;i++)
		coincombination(arr,remaining-arr[i],ans+arr[i],i);
	}

}
