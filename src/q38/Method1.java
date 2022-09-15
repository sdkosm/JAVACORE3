package q38;

public class Method1 {

	int sum = 0;
	  
    public int add(int a, int b)   //this is method
    
    {
        sum = a + b;    
        return sum;
    }

    public static void main(String[] args)
    {
  
        // Creating an instance of method1n class
    	
        Method1 add1 = new Method1();
        
        int s = add1.add(1, 1005);
  
        System.out.println(s);
    }
	
}
