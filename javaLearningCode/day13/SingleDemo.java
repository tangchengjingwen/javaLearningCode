
/*
���߳��µĵ���

*/

//����ʽ
class Single
{
	private static final Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}



//����ʽ

����ͬ��Ϊ�˽�����̰߳�ȫ���⡣

����˫���ж���Ϊ�˽��Ч�����⡣




class Single
{
	private static Single s = null;

	private Single(){}

	public static Single getInstance()
	{
		if(s==null)
		{
			synchronized(Single.class)		
			{
				if(s==null)
		//				-->0 -->1
					s = new Single();
			}
		}
		return s;
	}
}
class  SingleDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
