package OOPS;

	class add 
	{
		public void add(int a,int b)
		{
			System.out.println(a+b);
		}
	}
	
	class sub extends add
	{
		public void sub(int a,int b)
		{
			System.out.println(a-b);
		}
	}
	
	class div extends sub
	{
		public void div(int a,int b)
		{
			System.out.println(a/b);
		}
	}
	
	class Cal extends div
	{
		public void sub(int a,int b)
		{
			System.out.println(a-b);
		}
		
		public void calculate()
		{
			add(10,2);
			sub(10,2);
			div(10,2);
		}
	}
	
	public class MultilevelInheritance extends Cal{
		public static void main(String[] args) {
			
			Cal c = new Cal();
			c.calculate();
		}
	}

