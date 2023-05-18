package NumberPattern;

public class NumberPattern 
{
    
	public static void main(String[] args) 
	{

	int fn = 1;
	int ln = 5;
	for(int i=fn;i<=ln;i++)
	{
		for(int j=fn;j<=i;j++)
		{
			System.out.print(j);
			
		}
		System.out.println();
	}
	
	}
}

//1
//12
//123
//1234
//12345