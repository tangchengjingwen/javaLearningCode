

class Demo
{
	public int show(int index)throws ArrayIndexOutOfBoundsException
	{

		if(index<0)
			throw new ArrayIndexOutOfBoundsException("Խ��������");
		int[] arr = new int[3];
		return arr[index];
	}
}


class ExceptionDemo5 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			
			int num = d.show(-1);
			System.out.println("num="+num);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());

//			return ;
//			System.exit(0);//�˳�jvm��
		}
		finally//ͨ�����ڹر�(�ͷ�)��Դ��
		{
			System.out.println("finally");
		}

		System.out.println("over");

	}
}
/*

�������ݿ�
��ѯ��Exception
�ر����ӡ�

*/


/*
try catch finally ���������ص㣺

1��
try catch finally

2,
try catch(���)��û�б�Ҫ��Դ��Ҫ�ͷ�ʱ�����Բ��ö���finally��

3,
try finally �쳣�޷�ֱ��catch����������Դ��Ҫ�رա� 


void show()throws Exception
{
	try
	{
		//������Դ��
		throw new Exception();
	}
	finally
	{
		//�ر���Դ��
		
	}


	/*
	catch(Exception e)
	{
		
	}
	*/
	
}


*/