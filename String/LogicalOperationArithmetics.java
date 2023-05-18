package String;

public class LogicalOperationArithmetics {

	public static void main(String[] args) {
		
		String str ="1234567";
		
		String[] rstr = str.split("");
		
		int sumOfAllValues = sumofAll(rstr)+mulOdd(rstr)+lastThreeVal(rstr);
		
		System.out.println(sumOfAllValues	);
		
	}
	
	static int sumofAll(String[] pstr)
	{
		int sum = 0;
		for(int i=0;i<pstr.length;i++)
		{
			sum = sum + Integer.parseInt(pstr[i]);
		}
			
		return sum;
	}
	
	static int mulOdd(String[] astr)
	{
		int mul = 1;
		for(int i=0;i<astr.length;i++)
		{
			if(i%2==0)
			mul = mul * Integer.parseInt(astr[i]);
		}
		return mul;
	}
	
	static int lastThreeVal(String[] bstr)
	{
		int lsum = 0;
		int count = 1;
		for(int i=bstr.length-1;i>0;i--)
		{
			if(count!=4)
			{
				lsum = lsum + Integer.parseInt(bstr[i]);
				count++;
			}
			else 
				break;
			
		}
		
		return lsum;
	}
}
