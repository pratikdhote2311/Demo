package Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
//Here we are given an ArrayList of strings and the task is to convert the ArrayList to a string array.
//
//Illustration:
//=============
//Input : ArrayList = [ "Geeks", "for", "Geeks" ]
//Output: String[] = {"Geeks", "for", "Geeks"}
//Input : ArrayList = [ "Jupiter", "Saturn", "Uranus", "Neptune", "Sun"]
//Output: String[] = {"Jupiter", "Saturn", "Uranus", "Neptune", "Sun"}
//
//

class Convert
{
	public static List<String> convertArrayToString(List<String>a)
	{
		List<String>l1=new ArrayList<>(a);
		String b[]=new String[l1.size()];
		int j=0;
		
		for(int i=0;i<b.length;i++)
		{
			b[j]=l1.get(i);
			j++;
		}
		
		
		System.out.println(Arrays.toString(b));
		return l1;
	}
}
public class ArrayListTOStringArray 
{
	public static void main(String[] args) 
	{
		
		List<String>l1=new ArrayList<>();
		
		l1.add("Geeks");
		l1.add("For");
		l1.add("Geeks");
		
		
	     Convert.convertArrayToString(l1);
		
		
		
	}

}
