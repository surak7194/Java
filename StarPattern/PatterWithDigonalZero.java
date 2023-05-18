package StarPattern;

public class PatterWithDigonalZero {
/*
	public static void main(String[] args) {
		
		int row = 3;
		int col =3;
		
		int count = 1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(count==1||count==5||count==9)
				{
					System.out.print("0");
					count++;
				}
			    else
			    {
			    System.out.print(count);
				count++;
			    }
			}
			System.out.println();
		}
	}*/
	
	public static void main(String[] args) {
		int counter = 1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++,counter++)
			{
				if(j==i)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(counter);
				}
			}
			System.out.println();
		}
	}
}
