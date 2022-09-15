package q31;

public class Variable {

	int instanceVariable;                             //this is instance variable why bcz this outside method and inside class
	   
	   public static void main(String args[]){
	      int a = 100;                                //this is local variable bcz this is inside method 
	      Variable obj = new Variable();
	      
	      System.out.println("Value of instance variable instanceVariable: "+obj.instanceVariable);
	      System.out.println("Value of local variable a: "+ a);
	   }
	
}
