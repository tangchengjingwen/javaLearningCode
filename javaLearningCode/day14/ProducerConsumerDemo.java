
/*
�����ߣ������ߡ�

�������ߣ��������ߵ����⡣
if�жϱ�ǣ�ֻ��һ�Σ��ᵼ�²������е��߳������ˡ����������ݴ���������
while�жϱ�ǣ�������̻߳�ȡִ��Ȩ���Ƿ�Ҫ���У�

notify:ֻ�ܻ���һ���̣߳�������������˱�����û�����塣����while�жϱ��+notify�ᵼ��������
notifyAll����˱����߳�һ���ỽ�ѶԷ��̵߳����⡣


*/

class Resource
{
	private String name;
	private int count = 1;
	private boolean flag = false;
	public synchronized void set(String name)//  
	{
		while(flag)
			try{this.wait();}catch(InterruptedException e){}//   t1    t0
		
		this.name = name + count;//��Ѽ1  ��Ѽ2  ��Ѽ3
		count++;//2 3 4
		System.out.println(Thread.currentThread().getName()+"...������..."+this.name);//������Ѽ1 ������Ѽ2 ������Ѽ3
		flag = true;
		notifyAll();
	}

	public synchronized void out()//  t3
	{
		while(!flag)
			try{this.wait();}catch(InterruptedException e){}	//t2  t3
		System.out.println(Thread.currentThread().getName()+"...������........"+this.name);//���ѿ�Ѽ1
		flag = false;
		notifyAll();
	}
}

class Producer implements Runnable
{
	private Resource r;
	Producer(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.set("��Ѽ");
		}
	}
}

class Consumer implements Runnable
{
	private Resource r;
	Consumer(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.out();
		}
	}
}



class  ProducerConsumerDemo
{
	public static void main(String[] args) 
	{
		Resource r = new Resource();
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);

		Thread t0 = new Thread(pro);
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		Thread t3 = new Thread(con);
		t0.start();
		t1.start();
		t2.start();
		t3.start();

	}
}

