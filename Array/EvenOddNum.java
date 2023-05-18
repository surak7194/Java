package Array;

public class EvenOddNum {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
	
	    int num = 0;
	    System.out.println("Even Numbers");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ,");
			}
		}
		System.out.println();
		System.out.println("Odd Numbers");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ,");
			}
		}
	}
}
