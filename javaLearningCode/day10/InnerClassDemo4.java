
/*
�����ڲ��ࡣ�����ڲ���ļ�д��ʽ��
	
	������ǰ�᣺
	�ڲ������̳л���ʵ��һ���ⲿ����߽ӿڡ�

�����ڲ��ࣺ��ʵ����һ������������� 

��ʽ��new ����or�ӿ�(){��������}

*/

abstract class Demo
{
	abstract void show();
}

class Outer
{
	int num = 4;
	/*
	class Inner extends Demo
	{
		void show()
		{
			System.out.println("show ..."+num);
		}
	}
	*/
	public void method()
	{
		//new Inner().show();
		new Demo()//�����ڲ��ࡣ
		{
			void show()
			{
				System.out.println("show ........"+num);
			}
		}.show();
	}
}


class InnerClassDemo4 
{
	public static void main(String[] args) 
	{
		new Outer().method();
	}
}
