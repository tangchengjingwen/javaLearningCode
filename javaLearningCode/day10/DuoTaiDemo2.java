

/*
����ʦ�ͱ���ү�Ĺ��¡�
*/

class ����ү
{
	void ����()
	{
		System.out.println("����");
	}
	void ����()
	{
		System.out.println("����");
	}
}

class ����ʦ extends ����ү
{
	void ����()
	{
		System.out.println("Java");
	}
	void ����Ӱ()
	{
		System.out.println("����Ӱ");
	}
}





class  DuoTaiDemo2
{
	public static void main(String[] args) 
	{
//		����ʦ x = new ����ʦ();
//		x.����();
//		x.����Ӱ();

		����ү x = new ����ʦ();
		x.����();
		x.����();

		����ʦ y = (����ʦ)x;//ClassCastException
		y.����Ӱ();




	}
}
