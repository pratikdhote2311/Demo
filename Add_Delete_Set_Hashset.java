package Collection_Framework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Add_Delete_Set_Hashset 
{
	public static void main(String[] args) 
	{
		
		Set<String>s1=new HashSet<>();
		
		Scanner scan=new Scanner(System.in);
		while(true)
		{
		System.out.println("Options");
		System.out.println("1.Add elements");
		System.out.println("2.Delete elements");
		System.out.println("3.Display hashset");
		System.out.println("4.Exit ");
		
		System.out.println("Enter the number :");
		int ele=scan.nextInt();
		
		switch(ele)
		{
		case 1:   System.out.println("Enter the element :");
		          String element=scan.next();
		          if(s1.add(element))
		          {
		          
		          System.out.println("Element Added Sucessfully");
		          }
		          else
		          {
		        	  System.out.println("Elements already exist in the list");
		          }
		         
		          break;
		          
		case 2:   System.out.println("Enter the element :");
		          String del=scan.next();
		          
		          if(s1.remove(del))
		          {
		        	  System.out.println("Element deleted Sucessfully");
		          }
		          else
		          {
		        	  System.out.println("Elements not availabel in this hashlish");
		          }
		          break;
		          
		case 3:   System.out.println("Displaying elements :");
		          
		          s1.forEach(num->System.out.println(num));
		          
		          break;
		          
		
		          
		case 4:  System.out.println("Exiting the program");
		         System.exit(0);
		         break;
		default : System.out.println("Invalid number choice ,Please enter correct number");
		}
		}
	}

}
