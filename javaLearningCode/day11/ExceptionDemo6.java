

�쳣��ע�����

1�������ڸ��Ǹ��෽��ʱ������ķ�������׳����쳣��
��ô����ķ���ֻ���׳�������쳣���߸��쳣�����ࡣ

2����������׳�����쳣����ô����ֻ���׳������쳣���Ӽ���



��˵�����า�Ǹ���ֻ���׳�������쳣������������Ӽ��� 

ע�⣺�������ķ���û���׳��쳣����ô���า��ʱ���Բ����ף���ֻ��try .

interface  Inter
{
	void function();
}

class D implements Inter
{
	public void function()//throws Exception
	{}
}


class A extends Exception 
{
}

class B extends A
{
}
class C extends Exception 
{
}


Exception
	|--A
		|--B
	|--C


class Fu
{
	void show()throws A
	{}
}


class Test
{
	void method(Fu f)//Fu f  = new Zi();
	{
		try
		{
			f.show();
			
		}
		catch (A  a)
		{
		}
	}
}


class Zi extends Fu
{
	void show()throws C
	{
	
	}
}




class  
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show(new Zi());
	}
}
