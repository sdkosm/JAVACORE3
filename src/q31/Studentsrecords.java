package q31;

public class Studentsrecords  
{  
 
    public String name; //public instance  
    String division;    //default instance  
    private int age;    //private instance  
    
//constructor
    
    public Studentsrecords(String sname)  
    {  
        name = sname;  
    }  
  
//method 
    
    public void setDiv(String sdiv)  
    {  
        division = sdiv;  
    }  
      
//method
    
    public void setAge(int sage)  
    {  
        age = sage;  
    }  
  
 //method
    
    public void printstud()  
    {  
        System.out.println("Student Name: " + name );  
        System.out.println("Student Division: " + division);   
        System.out.println("Student Age: " + age);  
    }  
  
//main method 
    
    public static void main(String args[])  
    {  
        Studentsrecords s = new Studentsrecords("Deepak");  
        s.setAge(22);  
        s.setDiv("A");  
        s.printstud();  
    }  
}  
