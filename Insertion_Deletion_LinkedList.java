

package Collection_Framework;

import java.util.LinkedList;
import java.util.Scanner;

//Insertion, deletion, displaying and exit

public class Insertion_Deletion_LinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<Object>l1=new LinkedList<>();
		
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Insert Element ");
			System.out.println("2. Delete Element ");
			System.out.println("3. Display Element ");
			System.out.println("4. Exit ");
			
			
			System.out.println("Enter your choice :");
			int choice=scan.nextInt();
			
			
			switch(choice)
			{
			
			case 1:  System.out.println("Enter element to insert :");
				 int element =scan.nextInt();
			         l1.add(element);
			         System.out.println(l1);
			         break;
			         
			case 2: if(l1.isEmpty())
			{
				System.out.println("Linked list is empty.Nothing to delete");
			}
			else
			{
				System.out.println("Enter the element to delete ");
				int eledelete =scan.nextInt();
				boolean removed=l1.remove(Integer.valueOf(eledelete));
				 System.out.println(l1);
				if(removed)
				{
					System.out.println("Element "+ eledelete+" deleted in LinkedList");
				}
				else
					
				{
					System.out.println("Element is not found in LinkedList");
				}
				
			}
			
			break;
			case 3:  System.out.println("Displaying the elements ");
			         l1.forEach(num-> System.out.println(num));
			         
			         break;
				
			case 4:  System.out.println("Exiting the program");
			scan.close();
			         System.exit(0);
			         break;
			         
			         
          default :System.out.println("Wrong input press please enter the correct input ");
			}
			
		}
		
		
	}

}
