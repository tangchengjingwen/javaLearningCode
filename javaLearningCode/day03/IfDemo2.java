class IfDemo2 
{
	public static void main(String[] args) 
	{
		/*
		if���ĵڶ��ָ�ʽ��

		if(�������ʽ)
		{
			ִ����䣻
		}
		else//����
		{
			ִ����䣻
		}

		*/
		int x = 1;
		if(x>1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		System.out.println("Hello World!");


		int a = 3,b;
		/*
		if(a>1)
			b = 100;
		else
			b = 200;
			*/
		b = a>1?100:200;//��Ԫ���������if else ����д��ʽ��

//		��д��ʽʲôʱ���ã�
//			��ifelse�������һ������Ľ��ʱ�����Լ�д����Ԫ�������
		System.out.println("b="+b);
	}
}
