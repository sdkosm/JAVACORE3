package q32;

public class Finalize {

	public static void main(String[] args)
    {
        Finalize s = new Finalize();
//        s = null;
 
        s.finalize();
        // Requesting JVM to call Garbage Collector method
        
        System.gc();
        System.out.println("Main Completes");
    }
 
    // Here overriding finalize method
	
    public void finalize()
    {
        System.out.println("finalize method overridden");
    }
	
}
