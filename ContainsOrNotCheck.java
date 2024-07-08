package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class ContainsOrNotCheck 
{
	
	public static void main(String[] args) 
	{
		
		List<Integer>l1=new ArrayList<>();
		
		l1.add(12);
		l1.add(13);
		l1.add(14);
		
		
		List<Integer>l2=new ArrayList<>();
		
		l2.add(2);
		//l2.add(3);
		
		
		
		List<String>l3=new ArrayList<>();
		
		for(Integer e:l1)
		{
			l3.add(l2.contains(e)?"Equal":"Not Equal");break;
		}
		
		for(String b:l3)
		{
			System.out.println(b);
		}

		
	}

}
