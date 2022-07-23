package threadsCreation;

public class MyThread extends Thread {

	public void run()
 	{
  		System.out.println("CHILD CLASS THREAD");
}
 	public static void main( String args[] )
 	{
  		MyThread mt = new  MyThread();
  		mt.start();
 	}


}
