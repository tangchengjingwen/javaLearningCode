


class Outer
{
	void method()
	{
		Object obj = new Object()
		{
			public void show()
			{
				System.out.println("show run");
			}

		};
		obj.show();//��Ϊ�����ڲ�����������������ת��Ϊ��Object���͡�
					//�����Ͳ�����ʹ���������еķ����ˡ�


	}
}

class InnerClassDemo6 
{
	public static void main(String[] args) 
	{
		new Outer().method();
	}
}
