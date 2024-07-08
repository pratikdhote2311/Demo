package Collection_Framework;


//Write a Java program to convert Array to List.
//A BLC class called ArrayToList is given to you.
//Add a static method: convertToList(String[] inputArray) : This method 
//takes an array of strings as an argument. It should convert the given 
//array to a list of Strings and return this list. 
//Note that the length of the list must be the same as that of the array. 
//Return null for errors a null array or an empty list for an empty 
//array.
//An ELC Class called Tester with the main method is given to you. Use 
//this class to test your solution



import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class ArrayToStr
{
	
	public static List<String> convertArrayToList(String[]input)
	{
		
		if(input==null)
		{
			System.out.println("Array is null or Empty");
			
			return null;
		}
		List<String>l1=new ArrayList<>();
		
		for(String result:input)
		{
			l1.add(result);
			
		}
		
		return l1;
	}
}
public class ArrayToString 
{
	
	public static void main(String[] args) 
	
	{
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String :");
//	String name[]= {"Pratik","Ritik","Kunal"};

     int name=scan.nextInt();
     
     scan.nextLine();
     
     String a[]=new String[name];
     
     for(int i=0;i<a.length;i++)
    	 
     {
    	 a[i]=scan.nextLine();
     }
	
	List<String>l2=ArrayToStr.convertArrayToList(a);
	
	//l2.forEach(num->System.out.println(num));
	
	ListIterator <String>l1=l2.listIterator();
	
	System.out.println("Forward Directions :");
	while(l1.hasNext())
	{
		System.out.println(l1.next());
	}
	
	System.out.println("Backward Directions :");
	
	while(l1.hasPrevious())
	{
		System.out.println(l1.previous());
	}
	}
	
	
}
