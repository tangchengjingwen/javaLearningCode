class  WhileTest2
{
	public static void main(String[] args) 
	{

		/*
		��ϰ��
		1~100֮�� 6�ı������ֵĴ�����
		Ҫ���Լ��������˼�����д���Ͳ��������������


		*/

//		������˼��
		int x = 1;
		int count = 0;
		while(x<=100)
		{
			if(x%6==0)
				count++;
//				System.out.println("x="+x);
			x++;
		}

		System.out.println("count="+count);
	}
}
