package Array;

public class ArrayMax {
	public static void main(String[] args) {
		
		int[] arr = {1,3,4,0,5,6};
		int max = arr[0];
		int index = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
				index = i;
			}
		}
		System.out.println("Max element is: "+max+" at "+index+"th index");
	}
}
