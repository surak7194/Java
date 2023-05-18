package String;

public class LineComment {

	public static void main(String[] args) {
		
	String str = "int a*= 12;//* is a pointer";
		
		String str1 = "";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='*' && i<str.indexOf(";"))
			{
				str1 +='-';//str1 = str1 + '-';
				
			}
			else if(str.charAt(i)== '=')
			{
				str1 += '>';
			}
			else
				str1 = str1 + str.charAt(i);
		}
		System.out.println(str1);
	
	}
}
