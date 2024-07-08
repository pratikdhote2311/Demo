package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

import practice_programs.Practice;

class FindDuplicate
{
	private List<Integer> numberList;
	
	public FindDuplicate()
	{
		this.numberList=new ArrayList<>();
	}
	
	public FindDuplicate(List<Integer>numberList)
	{
		this.numberList=numberList;
	}
	
	public List<Integer> getNumberList()
	
	{
		return numberList;
		
	}
	
	
	public void setNumber(List<Integer>numberList)
	{
		this.numberList=numberList;
	}
	
	
	public static List<Integer> getFindDuplicate(Integer[] a)
	{
		
		List<Integer>isDuplicated=new ArrayList<>();
		
		
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c==1 && !isDuplicated.contains(a[i]))
			{
				
				isDuplicated.add(a[i]);
				
 			}
		}
		
		return isDuplicated;
	
		
	}
}
public class DuplictesArrayList 
{
	public static void main(String[] args)
	{
		
		Integer a[]= {1,61,2,3,4,5,61,2,3,1};
		
		List<Integer>l1=FindDuplicate.getFindDuplicate(a);
		
	System.out.println("Duplicate elements is : "+l1);
		
	}

}























//String s1="A,B,C,D,E,A,B";
//
//String[] elements = s1.split(",");
//
//List<String>l2=Practice.findData(elements);
//
//System.out.print(l2+" ");
//
//l2.set(0, "Pratik");
//System.out.println(l2);
//
//
//
//}
//
//public static List<String> findData(String[]a)
//{
//	List<String>l1=new ArrayList<>();
//	
//	for(int i=0;i<a.length;i++)
//	{
//		int c=0;
//	   for(int j=i+1;j<a.length;j++)
//	   {
//		   if(a[i].equals(a[j]))
//		   {
//			   c++;
//		   }
//	   }
//	   
//	   if(c==1 && !l1.contains(a[i]))
//	   {
//		   l1.add(a[i]);
//	   }
//	}
//	return l1;