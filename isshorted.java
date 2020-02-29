package recursion;

public class isshorted {

	public static void main(String[] args) {
		//int arr[]=new int[6];
		int arr[]= {1,2,3,4,7,6};
		int i=0;
        System.out.println(isshort(arr,i));
	}
	public static boolean isshort(int []arr,int i)
	{    if(arr.length-1==i)
	{
		return true;
	}
		if(arr[i]>arr[i+1])
		{
			return false;
		}else {
			 boolean restans= isshort(arr,i+1);
		
		return restans;
		}
	}

}
