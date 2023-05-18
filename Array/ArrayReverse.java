package Array;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6};
		
//		for(int i=arr.length-1;i>=0;i--)
//		{
//		   System.out.print(arr[i]+" ");
//		}   
		
		//OR  Without loops
		
//		 printArray(arr, 6);
	     rvereseArray(arr, 0, 5);
	     System.out.println("Reversed array is ");
	     printArray(arr, 6);
		
	}
	
	static void rvereseArray(int arr[], int start, int end)
    {
        int temp;  
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
	
	  static void printArray(int arr[], int size)
	    {
	        for (int i=0; i < size; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println("");
	    }
}
