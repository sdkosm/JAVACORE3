package q32;

public class Finally {

	public static void main(String[] args)
    {
        int k = 0;
        try {
            System.out.println("In try block");
            int z = k / 0;
        }
 
        catch (ArithmeticException e) {
            System.out.println("Dividing by zero but caught");
        }
 
        finally
        {
            System.out.println("Executes whether exception occurs or not");
        }
    }
	
}
