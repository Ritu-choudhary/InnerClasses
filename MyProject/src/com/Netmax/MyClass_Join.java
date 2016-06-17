package com.Netmax;

public class MyClass_Join
{

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable()
		{

			public void run()
			{
				System.out.println("First task started...");
				System.out.println("Sleeping for 2 seconds");
				try
				{
					Thread.sleep(2);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println("First task completed...");
			}
		});
		Thread t2 = new Thread(new Runnable()
		{

			public void run()
			{
				System.out.println("Second task started...");
				System.out.println("Second task completed...");
			}
		});
		Thread t3 = new Thread(new Runnable()
		{

			public void run()
			{
				System.out.println("third task started...");
				System.out.println("third task completed...");
			}
		});
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} // Giving a timeout within join(), will make join() effect to be nullified after specific timeout.*/
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t3.start();
		/*try {
			t3.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}*/
		
		
	}
}

/* Important Comments :-
	 join :: Thread instance can be used to “join” the start of a thread’s execution to the end of another thread’s execution so
	 that a thread will not start running until another thread has ended. If join() is called on a Thread instance, the
	 currently running thread will block until the Thread instance has finished executing.
*/
