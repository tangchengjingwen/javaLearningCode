

/*
ͬ��������ʹ�õ�����this��

ͬ��������ͬ������������
ͬ�����������ǹ̶���this��

ͬ����������������Ķ���

����ʹ��ͬ������顣


*/
class Ticket implements Runnable
{
	private  int num = 100;
//	Object obj = new Object();
	boolean flag = true;
	public void run()
	{
//		System.out.println("this:"+this);

		if(flag)
			while(true)
			{
				synchronized(this)
				{
					if(num>0)
					{
						try{Thread.sleep(10);}catch (InterruptedException e){}						
						System.out.println(Thread.currentThread().getName()+".....obj...."+num--);
					}
				}
			}
		else
			while(true)
				this.show();
	}

	public synchronized void show()
	{
		if(num>0)
		{
			try{Thread.sleep(10);}catch (InterruptedException e){}
			
			System.out.println(Thread.currentThread().getName()+".....function...."+num--);
		}
	}
}

class SynFunctionLockDemo 
{
	public static void main(String[] args) 
	{
		Ticket t = new Ticket();
//		System.out.println("t:"+t);

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		try{Thread.sleep(10);}catch(InterruptedException e){}
		t.flag = false;
		t2.start();
	}
}
