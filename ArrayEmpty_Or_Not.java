package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayEmpty_Or_Not 
{
	public static void main(String[] args)
	{
		
		List<Integer>l1=new ArrayList<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		
		l1.removeAll(l1);
		
		
		List<String>l2=new ArrayList<>();

		l2.add(l1.isEmpty()?"True":"False");
		
		
		System.out.println(l2.get(0));
	}

}
