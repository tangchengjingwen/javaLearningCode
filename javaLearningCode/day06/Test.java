//�����������Ͳ�������
class Demo 
{
	public static void main(String[] args) 
	{

		int x = 3;
		show(x);
		System.out.println("x="+x);
	}
	public static void show(int x)
	{
		x = 4;
	}
}

//�����������Ͳ�������
class Demo
{
	int x = 3;
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.x = 9;
		show(d);
		System.out.println(d.x);
	}
	public static void show(Demo d)
	{
		d.x = 4;
	}
}

