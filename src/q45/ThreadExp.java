
package q45;

class ThreadExp extends Thread{
	   public void run(){
	      System.out.println("Thread is running");
	   }
	   public static void main(String args[]){
		   ThreadExp t1=new ThreadExp();
	      t1.start();
	   }
	}
