/*
�ڲ�����Դ���ھֲ�λ���ϡ� 
�ڲ����ھֲ�λ����ֻ�ܷ��ʾֲ��б�final���εľֲ�������
*/


class Outer
{
	int num = 3;
	Object method()
	{

		final int x = 9;

		class Inner
		{
			public String toString()
			{
				return "show ..."+x;
			}
		}

		Object in = new Inner();
		return in;//0x0045
//		in.show();
	}


	
}

class InnerClassDemo3 
{
	public static void main(String[] args) 
	{
		Outer out = new Outer();
		Object obj = out.method();
		System.out.println(obj);

	}
}
/*

class Fu extends Object
{
}
class zi extends Fu
{
}

Fu f = new zi();

Object o = new Fu();
*/