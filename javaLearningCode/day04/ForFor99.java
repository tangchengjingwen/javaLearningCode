class ForFor99 
{
	public static void main(String[] args) 
	{

		/*
		�žų˷���
		1*1=1
		1*2=2 2*2=4
		1*3=3 2*3=6 3*3=9
		
		*/

		for (int x=1; x<=9 ;x++ )
		{
			for (int y=1; y<=x ;y++ )
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}


		/*
		\n:�س���
		\t:�Ʊ����
		\b:�˸�
		\r: ���»س�����

		windowsϵͳ�лس�����ʵ��������������ɵ� \r\n.
		linux�лس����� \n.

			
		System.out.println("\\hello world\\");
		*/
	
	}
}
