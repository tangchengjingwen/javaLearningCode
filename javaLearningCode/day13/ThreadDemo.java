/*
�����̵߳ĵ�һ�ַ�ʽ:�̳�Thread�ࡣ

�����̵߳ĵڶ��ַ�ʽ��ʵ��Runnable�ӿڡ�

1,������ʵ��Runnable�ӿڡ�
2�����ǽӿ��е�run���������̵߳���������װ��run�����С�
3��ͨ��Thread�ഴ���̶߳��󣬲���Runnable�ӿڵ����������ΪThread��Ĺ��캯���Ĳ������д��ݡ�
	Ϊʲô����Ϊ�̵߳����񶼷�װ��Runnable�ӿ���������run�����С�
	����Ҫ���̶߳��󴴽�ʱ�ͱ�����ȷҪ���е�����

4�������̶߳����start���������̡߳�


ʵ��Runnable�ӿڵĺô���
1�����̵߳�������̵߳������з�������������˵����ķ�װ��
	������������˼�뽫����ķ�װ�ɶ���
2��������java���̳еľ����ԡ�

���ԣ������̵߳ĵڶ��ַ�ʽ��Ϊ���á�




*/


class Demo implements Runnable//extends Fu //׼����չDemo��Ĺ��ܣ������е����ݿ�����Ϊ�̵߳�����ִ�С�
					//ͨ���ӿڵ���ʽ��ɡ�
{
	public void run()
	{
		show();
	}
	public void show()
	{
		for(int x=0; x<20; x++)
		{
			System.out.println(Thread.currentThread().getName()+"....."+x);
		}
	}
}


class  ThreadDemo
{
	public static void main(String[] args) 
	{	
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();


//		Demo d1 = new Demo();
//		Demo d2 = new Demo();
//		d1.start();
//		d2.start();
	}
}



/*
class Thread 
{
	private Runnable r;
	Thread()
	{
	
	}
	Thread(Runnable r)
	{
		this.r  = r;
	}

	public void run()
	{
		if(r!=null)
			r.run();
	}

	public void start()
	{
		run();
	}
}
class ThreadImpl implements Runnable
{
	public void run()
	{
		System.out.println("runnable run");
	}
}
ThreadImpl i = new ThreadImpl();
Thread t = new Thread(i);
t.start();




class SubThread extends Thread
{
	public void run()
	{
		System.out.println("hahah");
	}
}
//SubThread s = new SubThread();
//s.start();

*/