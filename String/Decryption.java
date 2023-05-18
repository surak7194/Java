package String;

public class Decryption {

	public static String fun(String str)
	{
		/*write a code here*/
		String[] arr = str.split(" ");
		String nstr = "";
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i].equals("ne2ds"))
			{
				nstr = nstr + "needs" + " ";
				
			}
			else
			nstr = nstr + arr[i] + " "; 
		}
		
		return nstr;
	}
 	public static void main(String[] args) {
		
 		String s = "seaside the to sent be to ne2ds army ten of team a";
        
 		String up = fun(s);
 		
 		System.out.println(up);
 	}
}
