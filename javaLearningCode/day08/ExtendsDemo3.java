
//��Ա������
/*
���Ӹ����г��ֳ�Ա����һģһ�������������������ĺ�����
�������󣬳�Ϊ���ǲ�������ʱ�������Ӹ����е����ԡ�
�����������ԣ�
	1�����ء�ͬһ�����С�overload
	2�����ǡ������С�����Ҳ��Ϊ��д����д��override
	
����ע�����
1�����෽�����Ǹ��෽��ʱ������Ȩ�ޱ���Ҫ���ڵ��ڸ����Ȩ�ޡ� 
2����ֻ̬�ܸ��Ǿ�̬���򱻾�̬���ǡ�






*/
class Fu
{
	public static  void show()
	{
		System.out.println("fu show run");
	}
}

class  Zi extends Fu
{
	public static void show()
	{
		System.out.println("Zi show run");
	}
}

class ExtendsDemo3 
{
	public static void main(String[] args) 
	{
//		Zi z = new Zi();
//		z.show();
		NewPhone p = new NewPhone();
		p.show();
		p.call();
	}
}

/*
ʲôʱ��ʹ�ø��ǲ���?

����һ��������������չʱ��������Ҫ��������Ĺ���������
����Ҫ���������иù��ܵ���������ʱ����ʹ�ø��ǲ������.

*/
class honeP
{
	void call()
	{}
	void show()
	{		
		System.out.println("number");
	}
}

class NewPhone extends Phone
{
	void show()
	{
		System.out.println("name");
		System.out.println("pic");
		super.show();
	}
}











