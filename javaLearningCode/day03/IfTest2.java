class IfTest2 
{
	public static void main(String[] args) 
	{

		/*
		һ�����ļ���
		������3 4 5
		�ļ���6 7 8
		�＾��9 10 11
		������12 1 2 
		�����û�������·ݣ�������Ӧ�ļ��ڡ�


		*/
		
		int month = 8;
		
		if(month<1 || month>12)
			System.out.println(month+"��û�ж�Ӧ�ļ���");
		else if(month>=3 && month<=5)
			System.out.println(month+"���Ǵ���");
		else if(month>=6 && month<=8)
			System.out.println(month+"�����ļ�");
		else if(month>=9 && month<=11)
			System.out.println(month+"�����＾");
		else 
			System.out.println(month+"���Ƕ���");



		/*
		if(month==3 || month==4 || month==5)
			System.out.println(month+"���Ǵ���");
		else if(month==6 || month==7 || month==8)
			System.out.println(month+"�����ļ�");
		else if(month==9 || month==10 || month==11)
			System.out.println(month+"�����＾");
		else if(month==12 || month==1 || month==2)
			System.out.println(month+"���Ƕ���");
		else
			System.out.println(month+"��û�ж�Ӧ�ļ���");
			*/
			
	}
}
