/*

�쳣����Ĳ�׽��ʽ��
���ǿ��Զ��쳣��������Դ���ķ�ʽ��

�����ʽ�ǣ�

try
{
	//��Ҫ������쳣�Ĵ��롣
}
catch(�쳣�� ����)//�ñ������ڽ��շ������쳣����
{
	//�����쳣�Ĵ��롣
}
finally
{
	//һ���ᱻִ�еĴ��롣
}





�쳣�����ԭ��
1��������������׳���Ҫ�����쳣����ô�����ϱ���Ҫ������
	��������ں�������trycatch��׽���������ʧ�ܡ�
	
2��������õ��������쳣�ĺ�����ҪôtrycatchҪôthrows���������ʧ�ܡ�

3��ʲôʱ��catch��ʲôʱ��throws �أ�
	�������ݿ��Խ������catch��
	������ˣ���throws���ߵ����ߣ��ɵ����߽�� ��

4��һ����������׳��˶���쳣����ô����ʱ�������ж�Ӧ���catch��������ԵĴ���
	�ڲ��ּ�����Ҫ�����쳣�����׼����쳣���׳���������catch������





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
	public int method(int[] arr,int index)//throws NullPointerException,FuShuIndexException
	{	
		if(arr==null)
			throw new NullPointerException("û���κ�����ʵ��");
		if(index<0)
			throw new FuShuIndexException();
			
		return arr[index];
	}
}

class  ExceptionDemo4
{
	public static void main(String[] args) 
	{
		int[] arr = new int[3];		
		Demo d = new Demo();
		try
		{
			int num = d.method(null,-1);
			System.out.println("num="+num);
			
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.toString());
		}
		catch (FuShuIndexException e)
		{
			System.out.println("message:"+e.getMessage());
			System.out.println("string:"+e.toString());

			e.printStackTrace();//jvmĬ�ϵ��쳣������ƾ��ǵ����쳣��������������

			System.out.println("�����Ǳ��쳣!!!!");
		}
		/*
		catch(Exception e)//��catch�����catch���������档
		{
			
		}
		*/
		System.out.println("over");
	}
	
}
