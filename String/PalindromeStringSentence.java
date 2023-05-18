package String;

public class PalindromeStringSentence {

public static void main(String[] args) {
		
		String str = "home sweet home";
		String[] rstr = str.split(" ");
	
		String pstr="";
		
		for(int i=rstr.length-1;i>=0;i--)
		{
			pstr = pstr + rstr[i]+" ";
		}
		String sstr = pstr.trim();//removing white spaces
		if(sstr.equals(str))
		{
		System.out.println("String is palindrom");
		}
		else
		System.out.println("String is not Palindrome");
	}
}
