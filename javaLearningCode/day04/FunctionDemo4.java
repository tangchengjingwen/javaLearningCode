
/*
���󣺺��������ء� 
*/

class FunctionDemo4 
{
	public static void main(String[] args) 
	{
//		add(4,6,9);
//		System.out.println("Hello World!");
		printCFB(7);
	}

	/*
	���������ء�

	1��ͬһ���࣬
	2��ͬ����
	3������������ͬ��or �������Ͳ�ͬ��
	4���������غͷ���ֵ�����޹ء�
	5��java���Ͻ������ԣ�����������ֵĵ��õĲ�ȷ���ԣ������ʧ�ܡ�


	*/

	//�ӷ����㡣���������ĺ͡�
	public static int add(int a,int b)
	{
		return a+b;
	}
	

	//�ӷ����㡣����С���ĺ͡�
	public static double add(double a,double b)
	{
		return a+b;
	}

	//�ӷ����㣬���������ĺ͡� 
	public static int add(int a,int b,int c)
	{
		return add(a,b)+c;
	}


	/*
	��ӡ�˷���
	*/
	public static void printCFB(int num)
	{
		for(int x=1; x<=num; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}

	/*
	��ӡ��׼�˷���
	*/
	public static void printCFB()
	{
		printCFB(9);
	}

}
