package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

 class Customer
{
	
	private Integer customerNumber;
	private String customerName;
	private Double customerBill;
	
	public Customer(Integer customerNumber, String customerName, Double customerBill)
	{
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}

	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getCustomerBill() {
		return customerBill;
	}

	public void setCustomerBill(Double customerBill) {
		this.customerBill = customerBill;
	}

	@Override
	public String toString() {
		return "Customer_Comparator [customerNumber=" + customerNumber + ", customerName=" + customerName
				+ ", customerBill=" + customerBill + "]";
	}
	
	
	

}



public class Customer_Comparator 
{
	public static void main(String[] args) 
	{

		
		List<Customer>l1=new ArrayList<>();
		
		l1.add(new Customer(6, "Pratik", 500.00));
		l1.add(new Customer(1, "ABC", 1000.00));
		l1.add(new Customer(3, "XYZ", 4500.00));
		l1.add(new Customer(2, "Ritik", 800.00));
		
		System.out.println("Sorting CustomerNumber Wise :");
		Comparator<Customer>c1=(a,b)->a.getCustomerNumber()-b.getCustomerNumber();
		Collections.sort(l1,c1);
	    l1.forEach(num->System.out.println(num));
	    
		System.out.println("===============================================================");
		
		System.out.println("Sorting CustomerName Wise :");
		Comparator<Customer>c2=(a,b)->a.getCustomerName().compareTo(b.getCustomerName());
		Collections.sort(l1,c2);
		l1.forEach(num->System.out.println(num));
		
		System.out.println("===============================================================");

		
		System.out.println("Sorting CustomerBIll Wise :");
		Comparator<Customer>c3=(a,b)->a.getCustomerBill().compareTo(b.getCustomerBill());
	    Collections.sort(l1,c3);
		Iterator l2=l1.iterator();
		l1.forEach(num->System.out.println(num));
	}
	
}