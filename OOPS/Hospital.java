package OOPS;

public class Hospital {

	public static void main(String[] args) {
		
		Patient p1 =new Patient();
		p1.setWhowillTreat(new Doctor("Sameer"));
		System.out.println(p1.getWhowillTreat());
		
	}
	
}

class Patient
{
	String name;
	String Address;
	
	Doctor whowillTreat;
	
	
	public Doctor getWhowillTreat() {
		return whowillTreat;
	}
	public void setWhowillTreat(Doctor whowillTreat) {
		this.whowillTreat = whowillTreat;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
}

class Doctor
{
	String name;
	
	

	public Doctor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + "]";
	}

	
	
}
