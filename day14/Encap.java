package CTS;

public class Encap {

	    
	    public static void main(String args[])
	    {
	     employee obj = new  employee();
	       
	        obj.setage(45);
	        obj.setname("Naveen");
	        obj.setsalary(70900);
	       
	        System.out.println(obj.getage());
	        System.out.println(obj.getname());
	         System.out.println(obj.getsalary());
	    }

	}


	class employee{
	private int age ;
	private double salary;
	private String name;

	public int  getage()
	{
	    return age;

	}
	public String getname()
	{
	  return name;
	  
	}
	public double getsalary()
	{
	  return salary;
	}


	public void setname(String name)
	{
	 this.name=name;
	 
	}
	public void setage(int age) {
	this.age = age;
	}
	public void setsalary(double salary)
	{
	  this.salary=salary;
	}

}
