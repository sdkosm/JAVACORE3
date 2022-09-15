package q38;

public class Constructor1 {
	 int num;
	 String name;
	  
	    // This would be invoked while an object

	    Constructor1()
	    {
	        System.out.println("Constructor calling !!");
	    }
	  
	    public static void main(String[] args)
	    {
	        // this would invoke default constructor
	    	
	        Constructor1 dk1 = new Constructor1();

	        System.out.println(dk1.name);
	        System.out.println(dk1.num);
	    }
	
}
