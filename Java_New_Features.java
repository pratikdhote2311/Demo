package Collection_Framework;



record Pratik(int id,String name,double salary,int age,float sal)
{

	
	
}
public class Java_New_Features 
{
	
	public static void main(String[] args)
	{
		
		Pratik p1=new Pratik(1, "Pratik", 1000.00, 23,100.00f);
	
	     
		System.out.println(p1);
		
	}

}






//sealed class  Pratik permits Ritik,Kunal
//{
//	public void run()
//	{
//		System.out.println("Hello Pratik");
//	}
//}
//	
//final class Ritik extends Pratik
//{
//	public void run()
//	{
//		super.run();
//		System.out.println("Hello Ritik");
//	}
//}
//final class Kunal  extends Pratik
//{
//	public void run()
//	{
//		System.out.println("Bye");
//	}
//}
//public class Practice
//{
//	public static void main(String[] args)
//	{
//		Ritik r1=new Ritik();
//		r1.run();
//		
//	}
//}