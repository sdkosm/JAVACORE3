package q39;

public class StaticOverload1 {

	public static void display() {
	      System.out.println("StaticOverload1Class");
	   }

	   //Method overloading of static method
	
	   public static void display(int a) {
	      System.out.println("StaticOverload1Class" + a);
	   }

	class NewClass extends StaticOverload1 {
		
	   //Not method overriding but hiding
	
	   public static void display() {
	      System.out.println("NewClass");
	   }
	}
	
	   public static void main(String[] args) {
//		   StaticOverload1  object = new NewClass();
//
//	      object.display();        
//	      object.display(1);    
	   }
	
}
	   

