/*
���ڽǱ������������ڣ������ýǱ�Խ���ʾ��
���ڸ���Ϊ�Ǳ�������׼���ø����Ǳ��쳣����ʾ��

�����Ǳ������쳣��java�в�û�ж������
�ǾͰ���java�쳣�Ĵ���˼�룬������󣬽������Ǳ�����Զ�������������װ�ɶ���

�����Զ��������������Ϊ�Զ����쳣�� 

ע�⣺�����һ�����Ϊ�쳣�࣬����Ҫ�̳��쳣��ϵ����Ϊֻ�г�Ϊ�쳣��ϵ����������ʸ�߱������ԡ�
	�ſ��Ա������ؼ�����������throws throw




�쳣�ķ��ࣺ
1������ʱ������쳣:ֻҪ��Exception�������඼�ǣ�������������RuntimeException��ϵ�� 
		��������һ�����֣�ϣ���ڱ���ʱ�ͽ��м�⣬�����������ж�Ӧ�Ĵ���ʽ��
		���������ⶼ��������ԵĴ���


2������ʱ������쳣(����ʱ�쳣):����Exception�е�RuntimeException�������ࡣ
		��������ķ������޷��ù��ܼ����������޷����У���������Ϊ�����ߵ�ԭ���µĶ������������ڲ�״̬�ĸı䵼�µġ�
		��ô��������һ�㲻����ֱ�ӱ���ͨ����������ʱ���õ����ߵ���ʱ�ĳ���ǿ��ֹͣ,�õ����߶Դ������������



�����Զ����쳣ʱ��Ҫô�̳�Exception��Ҫô�̳�RuntimeException��


throws ��throw������

1��throwsʹ���ں����ϡ�
   throwʹ���ں����ڡ�
2��throws�׳������쳣�࣬�����׳�������ö��Ÿ�����
   throw�׳������쳣����


*/
class FuShuIndexException extends Exception
{
	FuShuIndexException()
	{}

	
	FuShuIndexException(String msg)
	{
		super(msg);
	}
}


class Demo
{
	public int method(int[] arr,int index)//throws NullPointerException//FuShuIndexException
	{		

		if(arr==null)
			throw new NullPointerException("��������ò���Ϊ�գ�");

		if(index>=arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("����ĽǱ�Խ���������ǣ����ǲ��Ƿ��ˣ���"+index);
		}
		if(index<0)
		{
			throw new FuShuIndexException("�Ǳ��ɸ���������");
		}
		return arr[index];
	}
}

class  ExceptionDemo3
{
	public static void main(String[] args) //throws FuShuIndexException
	{
		int[] arr = new int[3];
		
		Demo d = new Demo();
		int num = d.method(null,-30);
		System.out.println("num="+num);
		System.out.println("over");
	}
	
}

/*
class Person
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
class Student extends Person
{
	Student(String name)
	{
		super(name);
	}
}
*/