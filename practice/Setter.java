package practice;

public class Setter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee("Amir");
		System.out.println("Before=>"+e.getFname());		
		String str="";
		for(int i=0;i<e.getFname().length();i++)
		{
			if(i==0)
			{
			    str=str+'B';	
			
			}
			else
			{
				str=str+e.getFname().charAt(i);
			}
		}		
		e.setFname(str);		
		System.out.println("After=>"+e.getFname());
	}
}
class Employee{
	String fname;
	
	public Employee(String fname) {
		super();
		this.fname = fname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + "]";
	}

	
}
