
/*
������Ʊ��





*/



/*
�̰߳�ȫ���������ԭ��

1������߳��ڲ�����������ݡ�
2�������������ݵ��̴߳����ж�����

��һ���߳���ִ�в����������ݵĶ�����������У������̲߳��������㡣
�ͻᵼ���̰߳�ȫ����Ĳ����� 


���˼·��
���ǽ����������������ݵ��̴߳����װ�����������߳���ִ����Щ�����ʱ��
�����߳�ʱ�����Բ�������ġ�
����Ҫ��ǰ�̰߳���Щ���붼ִ����Ϻ������̲߳ſ��Բ������㡣 

��java�У���ͬ�������Ϳ��Խ��������⡣

ͬ�������ĸ�ʽ��
synchronized(����)
{
	��Ҫ��ͬ���Ĵ��� ��
}

ͬ���ĺô���������̵߳İ�ȫ���⡣


ͬ���ı׶ˣ���Խ�����Ч�ʣ���Ϊͬ������̵߳Ķ����ж�ͬ������


ͬ����ǰ�᣺ͬ���б����ж���̲߳�ʹ��ͬһ������



*/

class Ticket implements Runnable//extends Thread
{
	private  int num = 100;

	Object obj = new Object();
	public void run()
	{
		while(true)
		{
			synchronized(obj)
			{
				if(num>0)
				{
					try{Thread.sleep(10);}catch (InterruptedException e){}
					
					System.out.println(Thread.currentThread().getName()+".....sale...."+num--);
				}
			}
		}
	}
}


class  TicketDemo
{
	public static void main(String[] args) 
	{

		Ticket t = new Ticket();//����һ���߳��������

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();


		/*
		Ticket t1 = new Ticket();
//		Ticket t2 = new Ticket();
//		Ticket t3 = new Ticket();
//		Ticket t4 = new Ticket();

		t1.start();
		t1.start();//һ���̲߳��ܿ������Σ����׳���Ч�߳�״̬�쳣 
		t1.start();
		t1.start();
		*/

		
	}
}

