package Multithreading;

public class A extends Thread{
	
	@Override
	public void run() {
		
		
		System.out.println("Hiiii");
	}
	
	

	public static void main(String[] args) {
		
		A a = new A();
		a.start();
		
	}

}
