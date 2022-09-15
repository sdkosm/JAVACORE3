package q45;

	class RunnableExp implements Runnable{
		   public void run(){
		      System.out.println("Thread is running for Runnable Implementation");
		   }
		   public static void main(String args[]){
			   RunnableExp runnable=new RunnableExp();
		       Thread t1 =new Thread(runnable);
		      t1.start();
		   }
		}
