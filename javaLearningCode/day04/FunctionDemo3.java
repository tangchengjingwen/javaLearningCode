class FunctionDemo3 
{
	public static void main(String[] args) 
	{
//		draw(4,6);
//		draw(7,9);
//		print99();	

		System.out.println("hello");
		
	}

	/*
	����1�� ����һ�����ܣ�������������ĺ͵Ļ�ȡ��
	˼·����Ȼ���幦�ܣ����ǿ����ú��������֡�
		��ζ���һ�������أ�
		ͨ��������ȷ����ɡ�
	��ȷһ��������ܵĽ����ʲô��
		�Ǻ͡��ǹ��ܵĽ�������Ըù��ܵķ���ֵ������int ��
		��ʵ��������ȷ�����ķ���ֵ���͡�

			
	��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿
		�У������ͱ�����������Ǻ����Ĳ����б�(�����ĸ���������������)
		��ʵ��������ȷ�����б�

	ע�⣺����ֵ���ͺͲ�������û��ֱ�ӹ�ϵ��

	*/
	public static int add(int a,int b)
	{
		int sum = a+b;
		return sum;
	}

	/*
	����2�� ����һ�����ܣ���һ�������ڿ���̨��
	��ȷһ��������ܵĽ����ʲô��
		û�н������Ϊֱ�Ӵ�ӡ���ˣ�����̨����δ���ظ������ߡ�
		��void��ʾ��
	��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿
		�У��к��в�ȷ�������������� int.
	*/
	public static void draw(int row,int col)
	{
		for (int x=1; x<=row ;x++ )
		{
			for (int y=1;y<=col ; y++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
//		return ;//����ʡ�Բ�д��
	}


	/*
	����3�� ����һ�����ܣ��Ƚ��������Ƿ���ȡ�
	��ȷһ��������ܵĽ����ʲô��
			�У�boolean.
	��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿
			�У�����������

	*/
	public static boolean equals(int a,int b)
	{
		/*
		if(a==b)
			return true;
		else
			return false;


		boolean x ;
		if(a==b)
			x = true;
		else
			x = false;
		return x;

		*/
//		return (a==b)?true:false;

		return a==b;
		
	}

	/*
	����1�� ����һ�����ܣ���ȡ���������нϴ���Ǹ�����
	��ȷһ��������ܵĽ����ʲô��
			�У�����һ������ int
	��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿
			�У�����Ƚϵ��������� int
	*/
	public static int getMax(int a,int b)
	{
		/*
		if(a>b)
			return a;
		else
			return b;
		*/

		return a>b?a:b;
	}

	/*
	���幦�ܣ���ӡ99�˷���

	*/

	public static void print99()
	{
		for(int x=1; x<=9; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}

	/*
	���ݿ��Գɼ���ȡѧ��������Ӧ�ĵȼ�
	90~100		A
	80~89		B
	70~79		C
	60~69		D
	60����		E

	������ȼ����ַ���char
	���������� ��int.
	*/

	public static char getLevel(int num)
	{
		char level ;
		if(num>=90 && num<=100)
			level = 'A';
		else if(num>=80 && num<=89)
			level =  'B';
		else if(num>=70 && num<=79)
			level =  'C';
		else if(num>=60 && num<=69)
			level =  'D';
		else 
			level =  'E';

		return level;
	}


}
