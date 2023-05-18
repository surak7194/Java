package Array;

public class ArrayMin {

	public static void main(String[] args) {
		
		int[] arr = {1,3,4,0,5,6};
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Min element is: "+min);
	}
}
