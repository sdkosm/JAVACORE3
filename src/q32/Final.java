package q32;

public class Final {

	public static void main(String[] args)
    {
        // Non final variable
        int a = 5;
 
        // final variable
        final int b = 6;
 
        // modifying the non final variable : Allowed
        a++;
 
//if we try to modify it will show compile error or you can hover on b++
//        b++;
        
    }
	
}
