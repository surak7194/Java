package Array;

public class ArrayRepeatitingElement {
	static int findRepeating(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }
 
     public static void main(String[] args)
     {
        int[] arr = { 9, 8, 2, 6, 1, 5, 3, 4, 7 ,1};
        
        int repeatingNum = findRepeating(arr);
        
        System.out.println("Repeating Num is: ");
        System.out.println(repeatingNum);
     }
}
