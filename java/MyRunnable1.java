class MyRunnable1 implements Runnable
{
	public void run()
	{
		try{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Thread Running: " + i);
				Thread.sleep(1500);//Thread sleeps from running for 1500ms
			}
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		MyRunnable1 obj = new MyRunnable1();
		Thread t = new Thread(obj);
		t.start();
	}
}
