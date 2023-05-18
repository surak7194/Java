package OOPS;

public class Element {

	public static void main(String[] args) {
		
		Bc a = new Bc();
		
		a.show();
	}
			
	
}
	
class Ab
{
	String name="Sameer";
	int age;
	
}

class Bc extends Ab
{
	void show()
	{
		System.out.println(super.name);
	}
}
