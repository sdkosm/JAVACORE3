package q40;

public class DynamicBinding{

	 void eat()
	 {
		 System.out.println("animal is eating...");
     }   

	  
	class DynamicBinding1 extends DynamicBinding{  
	 void eat()
	 {
		 System.out.println("dog is eating...");
	 }  
	  
	 public static void main(String[] args)
	 {  
		 DynamicBinding a=new DynamicBinding();  
	     a.eat();  
	 }  
	
}
}