package StarPattern;

public class EvenOdd2 {

		public static void main(String [] args)
		{
			int rows =5;
			for(int i=1;i<=rows;i++)
			{
				for(int j=1;j<=i;j++)
	  			{
					if(i%2!=0)
					{
						System.out.print("0");
					}
					if(i!=4)
					{
						if(i%2==0)
						{
							System.out.print("1");
						}
					}
					if(j==4)	
					{
						int k=1;
						for(;k<4;k++)
						{
							System.out.print("1");
							
						}
						
					}
					
	 			}System.out.println();
			}
			
		}
}

/*

 */
