

/*
��̬ʱ��
��Ա���ص㣺
1����Ա������
	����ʱ���ο������ͱ������������е��Ƿ��е��õĳ�Ա�������У�����ͨ����û�У�����ʧ�ܡ�
	����ʱ���ο������ͱ������������е��Ƿ��е��õĳ�Ա�����������и��������еĳ�Ա������
	��˵����������ж��ο��Ⱥŵ���ߡ�Ŷ�ˡ�
	��Ϊ�˽⡣



2����Ա����(�Ǿ�̬)��
	����ʱ���ο������ͱ������������е��Ƿ��е��õĺ������У�����ͨ����û�У�����ʧ�ܡ�
	����ʱ���ο����Ƕ��������������Ƿ��е��õĺ�����
	��˵�����뿴��ߣ����п��ұߡ�

	��Ϊ��Ա�������ڸ������ԡ�




3����̬������
		����ʱ���ο������ͱ������������е��Ƿ��е��õľ�̬������
		����ʱ���ο������ͱ������������е��Ƿ��е��õľ�̬������
		��˵����������ж�����ߡ�

		��ʵ���ھ�̬�������ǲ���Ҫ����ġ�ֱ�����������ü��ɡ�


		

*/

class Fu
{
//	int num = 3;
	void show()
	{
		System.out.println("fu show");
	}

	static void method()
	{
		System.out.println("fu static method");
	}
}

class Zi extends Fu
{
//	int num = 4;
	void show()
	{
		System.out.println("zi show");
	}

	static void method()
	{
		System.out.println("zi static method");
	}
}



class  DuoTaiDemo3
{
	public static void main(String[] args) 
	{
		Fu.method();
		Zi.method();
		Fu f = new Zi();//
//		f.method();
//		f.show();
//		System.out.println(f.num);


//		Zi z = new Zi();
//		System.out.println(z.num);
	}
}
