interface Inter
{
	void show();
}

class Outer
{
	//������� (�����������ڲ���)
	
	static Inter method()
	{
		return new Inter()
		{
			public void show(){}
		};
	}
}
/*
class haha implements Inter
{
	public void show(){}
}
*/
class  InnerClassTest
{
	public static void main(String[] args) 
	{
		Outer.method().show();
		

	}
}
