package practice;

public class LargestSmallestNumber {

    public static void main(String[] args) 
    {
        int a = 2, b = 3;
        System.out.println("Largest Number: "+largestNum(a, b));
        System.out.println("Smallest Number: "+smallestNum(a, b));
    }
    
    static int largestNum(int a, int b) 
    {
        return a * ((a / b) > 0 ? 1 : 0) + b * ((b / a) > 0 ? 1 : 0);
    }

    static int smallestNum(int a, int b) 
    {
        return a * ((b / a) > 0 ? 1 : 0) + b * ((a / b) > 0 ? 1 : 0);
    }

}
