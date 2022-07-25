package Threads;


	public class Runnable extends Thread
{
 	public void run()
 	{
  		System.out.println(" The  thread started running..");
}
 	public static void main( String args[] )
 	{
 		Runnable thr = new  Runnable();
  		thr.start();
 	}
}


