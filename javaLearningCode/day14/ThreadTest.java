/*class Test implements Runnable
{
	public void run(Thread t)
	{}
}*/
//������� ����������һ�У������ڵ�һ�У�Ӧ�ñ�abstract����


class ThreadTest 
{
	public static void main(String[] args) 
	{

		new Thread(new Runnable()
		{
			public void run()
			{
				System.out.println("runnable run");
			}
		})
		{
			public void run()
			{
				System.out.println("subThread run");
			}
		}.start();


		/*
		new Thread()
		{
			public void run()
			{
				for(int x=0; x<50; x++)
				{
					System.out.println(Thread.currentThread().getName()+"....x="+x);
				}

			}
		}.start();
		
		for(int x=0; x<50; x++)
		{
			System.out.println(Thread.currentThread().getName()+"....y="+x);
		}
		Runnable r = new Runnable()
		{
			public void run()
			{
				for(int x=0; x<50; x++)
				{
					System.out.println(Thread.currentThread().getName()+"....z="+x);
				}
			}
		};
		new Thread(r).start();

		*/
		
	}
}
