/*
�ڲ�������ص㣺
1���ڲ������ֱ�ӷ����ⲿ���еĳ�Ա��
2���ⲿ��Ҫ�����ڲ��࣬���뽨���ڲ���Ķ���


һ�����������ơ�

��������ʱ�����ָ����������л����������������ﻹ�ڷ��ʱ�������������ݡ�
��ʱ���ǻ��е����ﶨ����ڲ�����������



*/
class Outer
{
	private static int num = 31;

	class Inner// �ڲ��ࡣ
	{
		void show()
		{
			System.out.println("show run..."+num);
		}
		/*static void function()//����ڲ����ж����˾�̬��Ա�����ڲ���Ҳ�����Ǿ�̬�ġ�
		{
			System.out.println("function run ...."+num);
		}
		*/
	}

	public void method()
	{
		Inner in = new Inner();
		in.show();
	}
}


class InnerClassDemo
{
	public static void main(String[] args) 
	{
//		Outer out = new Outer();
//		out.method();
		//ֱ�ӷ����ⲿ���е��ڲ����еĳ�Ա��
//		Outer.Inner in = new Outer().new Inner();
//		in.show();

		//����ڲ����Ǿ�̬�ġ� �൱��һ���ⲿ��
//		Outer.Inner in = new Outer.Inner();
//		in.show();

		//����ڲ����Ǿ�̬�ģ���Ա�Ǿ�̬�ġ�
//		Outer.Inner.function();
		
	}
}
