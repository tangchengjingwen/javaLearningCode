class  IfDemo3
{
	public static void main(String[] args) 
	{
		{//�ֲ��������Զ���ֲ��������������ڡ�
		int a = 3;
		//a �����㡣
		System.out.println(a+4);
		}

		/*
		if�������ָ�ʽ��
		if(�������ʽ)
		{
			ִ����䣻
		}
		else if (�������ʽ)
		{
			ִ����䣻
		}
		����
		else
		{
			ִ����䣻
		}

		*/
		int x = 3;
		if(x>1)
			System.out.println("a");
		else if(x>2)
			System.out.println("b");
		else if(x>3)
			System.out.println("c");
		else
			System.out.println("d");


		int y = 3;
		if(y>1)
			System.out.println("a1");
		if(y>2)
			System.out.println("b1");
		if(y>3)
			System.out.println("c1");
		else
			System.out.println("d1");


		if(x==1)
		
			if(y==1)
			
				System.out.println("a");
			
			else
				System.out.println("b");
			
		
		else
		
			if(y==1)
			
				System.out.println("c");
			
			else
			
				System.out.println("d");
			
		
//		if(false);

		
		{//�ֲ�����顣
			int m = 89;
			System.out.println("Hello World!..."+m);
		}

		System.out.println("over....."+m);
	}
}
