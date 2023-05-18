package OOPS;



interface  Hike
{
	void a();
	void b();
	default void hi()
	{
		System.out.println("S");
	}
}

class Hero implements Hike
{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterFace {

	public static void main(String[] args) {
	
		
	}
}
