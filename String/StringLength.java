package String;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		
		String[] lstr = str.split(" ");
		int length = lstr.length;
		System.out.println(length);
	}
}
