package Collection_Framework;


//
//Given two ArrayLists, the task is to print all common elements in both the ArrayLists in Java.
//
//Examples:
//
//
//
//Input: List1 = ["Hii", "Geeks", "for", "Geeks"], 
//
//  List2 = ["Hii", "Geeks", "Gaurav"]
//
//Output: [Hii, Geeks, Geeks]
//
//
//
//Input: List1 = ["a", "b", "c", "d", "e", "f"], 
//
//  List2 = ["b", "d", "e", "h", "g", "c"]
//
//Output:[b, c, d, e]


import java.util.ArrayList;
import java.util.List;


class CommonElement
{
	public static List<String> getFindElements(List<String> l1,List<String>l2)
	{
		List<String>l3=new ArrayList<>(l1);
		l3.retainAll(l2);
		
		return l3;
	}
}
public class CommonElementsBothArrayList 
{
	
	public static void main(String[] args) 
	{
		
		List<String>l1=new ArrayList<>();
		
		l1.add("Hii");
		l1.add("Geeks");
		l1.add("For");
		l1.add("Geeks");
		
		List<String>l2=new ArrayList<>();

		l2.add("Hii");
		l2.add("Geeks");
		l2.add("Gaurav");
		
		
		List<String>ele=CommonElement.getFindElements(l1, l2);
		System.out.println(ele);
				
		
	}

}
