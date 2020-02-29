package recursion;

public class bubble {

	public static void main(String[] args) {
		int arr[]= {60,50,40,30,20,10};
		bubblesort(arr,0,5);
		for(int i:arr)
			System.out.println(i);
	}
	public static void bubblesort(int []arr,int si,int li)
	{
		if(li==0)
			return;
		if(si==li)
		{
			bubblesort(arr,0,li-1);
			return;
		}
		if(arr[si]>arr[si+1])
		{
			int temp=arr[si];
			arr[si]=arr[si+1];
			arr[si+1]=temp;
		}
			bubblesort(arr,si+1,li);
		
	}

}
