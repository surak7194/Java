package OOPS;

abstract class Bike 
{
	abstract void run();
	void m() {
		System.out.println("Hello");
	}
}

class Honda extends Bike
{

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class Abstraction {
   public static void main(String[] args) {
	
	   Honda h = new Honda();
	   
}
}
