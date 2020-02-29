package recursion;

public class firstindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,7,6};
		int i=0;
		int d=7;
        System.out.println(index(arr,i,d));
	}
	public static int index(int arr[],int i,int d)
	{  if(d==arr[i])
		return i;
		if(arr.length-1==i)
			return -1;
		else {
	int restans=index(arr,i+1,d);
	return restans;
	}
	}
}
