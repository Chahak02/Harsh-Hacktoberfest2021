
class Ceiling {
//in a sorted array find the smallest number greater than or equal to the target
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,4,6,8,12,16,18};
		
		int target=1;
		ceiling(a,target);
	}
		static void ceiling(int[] arr,int target)
		{
			int start=0,mid=0;
			int end=arr.length-1;
		if(target>arr[end])
			System.out.println("-1");
		else
		{
		while(start<=end)
		{
			mid=start+((end-start)/2);
			if(arr[mid]==target)
				System.out.println(mid);
			else if(target>arr[mid])
				start=mid+1;
			else if(target<arr[mid])
				end=mid-1;
		}
		if(start>end)
		{
			System.out.println(start);
		}
		}
    }
