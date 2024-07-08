package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employeees
{
	private String name;
	private String position;
	private Double salary;
	
	
	public Employeees(String name, String position, Double salary) 
	{
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	
	
	
}

class Directory 
{
	

	List<Employeees>l1=new ArrayList<>();
	 
	public void addEmployee()
	{
		l1.add(new Employeees("Alice", "Manager", 50000.00));
		l1.add(new Employeees("Bob", "Developer", 25000.00));
//		l1.add(new Employee("Kunal", "CEO", 70000.00));
		
		Iterator i2=l1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}
	
	public void allDisplayDetails()
	{
		l1.forEach(num->System.out.println(num));
	}
	
	public void updateEmployees(int a,int b)
	{
		l1.set(a, new Employeees("Alice", "Developer", 56000.00));
		l1.set(b, new Employeees("Bob", "Senior Developer", 50000.00));
		
		Iterator l2=l1.listIterator();
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}
	}
	
	public void deleteAllEmployees(int a)
	{
		l1.remove(a);
		
		l1.forEach(num->System.out.println(num));
	}
}
public class Employee_Collection 
{

	public static void main(String[] args)
	{
		Directory d1=new Directory();
		
		System.out.println("Adding Employees Data:");
	     d1.addEmployee();
	     
	    System.out.println("---------------------------------------------------------");
	    
	    System.out.println("Employees After Update :");
	     d1.updateEmployees(0,1);
	     System.out.println("--------------------------------------------------------");
	     

	     System.out.println("Employees After Delete :");
	     d1.deleteAllEmployees(1);
	     System.out.println("---------------------------------------------------------");
	     
	     System.out.println("Final Record :");
	     d1.allDisplayDetails();
		
		
	}
}
