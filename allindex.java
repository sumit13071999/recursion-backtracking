package recursion;

public class allindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,7,4,7,6};
		int i=0;
		int d=7;
		int array[]=null;
        array=allindex(arr,i,d,0);
        for(int j:array)
        	System.out.println(j);
	}
 public static int[] allindex(int arr[],int i,int d,int c)
 {   int [] index=null;
	 if(i==arr.length)
	 {
		 int base[]=new int[c];
		 return base;
	 }
	 if(d==arr[i])
	 {
		 index=allindex(arr,i+1,d,c+1);
	 }else
		 index=allindex(arr,i+1,d,c);
         if(d==arr[i])
         {
			index[c]=i;
         }
         return index;
 }
}
