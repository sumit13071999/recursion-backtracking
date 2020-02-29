package recursion;

public class lastindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,7,6};
		int i=0;
		int d=7;
        System.out.println(lindex(arr,i,d));
	}
	public static int lindex(int arr[],int i,int d)
	{
		if(i==arr.length-1)
			return -1;
		int ans=lindex(arr,i+1,d);
		if(ans==-1) {
		if(d==arr[i])
			return i;
		else return -1;
		}
		return ans;
	}

}
