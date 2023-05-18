package practice;

public class Armstrong {

	public static void main(String[] args) {
		
		int num = 371, temp, rem, result = 0;

        temp = num;

        while (temp != 0)
        {
            rem = temp % 10;
            result = result + rem*rem*rem;
            temp = temp / 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
		
	}
}
