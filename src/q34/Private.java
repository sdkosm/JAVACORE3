package q34;

public class Private {

	private int data=40;  
	private void msg()
	{
		System.out.println("Hello");
	}  
	  
	public class Simple{  
		
	 public static void main(String args[]){ 
		 
	   Private obj=new Private();  
	   
	   System.out.println(obj.data);        //data field is not visible
	                                      //Compile Time Error  
	   obj.msg();                         //Compile Time Error  
	   }  	
}
}
