class ForTest 
{
	public static void main(String[] args) 
	{
		/*
		��for����ۼӡ�
		*/
		int sum = 0;
		for(int x=1; x<=10; x++)
		{
			sum = sum + x;	
		}

		System.out.println("sum="+sum);

		/*
		for��while���ص㣺
		1,for��while���Ի�����
		2,��ʽ�ϵĲ�ͬ����ʹ�����е�С����
			�����Ҫͨ����������ѭ�����п��ƣ��ñ���ֻ��Ϊѭ����������ʱ����������ֳ����ˡ�
		*/

		//��ӡ1~10ʮ������
		int x = 1;
		while(x<5)
		{
			System.out.println("x="+x);
			x++;
		}
		System.out.println("x===="+x);

		for(int y=1; y<5; y++)
		{
			System.out.println("y="+y);
		}
		System.out.println("y====="+y);


		//����ѭ����򵥵���ʽ��
//		while(true){}

//		for(;;){}

		ʲôʱ��ʹ��ѭ���ṹ�أ�
		����ĳЩ����ִ�кܶ��ʱ��ʹ��ѭ���ṹ��ɡ�
		
		����һ����������һ���ж�ʱ������ʹ��if��䡣
		����һ���������ж���ж�ʱ������ʹ��while��䡣 

		ע�⣺
			��ʹ��ѭ��ʱ��һ��Ҫ��ȷ��Щ�����Ҫ����ѭ������Щ����Ҫ��
			ѭ��ͨ������£���Ҫ������������Ҫ���ƴ�����

		

	}
}
