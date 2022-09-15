package q42;

	class CustomExceptions1 extends Exception  
	{  
	    
	}  
	
	public class CustomExceptions  
	{  
	    // main method  
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	            throw new CustomExceptions1();  
	        }  
	        catch (CustomExceptions1 e)  
	        {  
	            System.out.println("Caught the exception");  
	            System.out.println(e.getMessage());  
	        }  
	  
	        System.out.println("rest of the code...");    
	    }
}
	
