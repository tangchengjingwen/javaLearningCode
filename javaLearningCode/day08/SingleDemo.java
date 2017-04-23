
/*
���ģʽ����������֮��Ч�Ľ����ʽ����ʵ����һ��˼�롣

1,�������ģʽ��
	��������⣺���ǿ��Ա�֤һ�������ڴ��еĶ���Ψһ�ԡ�

������ڶ������ʹ��ͬһ��������Ϣ����ʱ������Ҫ��֤�ö����Ψһ�ԡ�

��α�֤����Ψһ���أ�
1������������������new�����������
2���ڸ��ഴ��һ������ʵ����
3�������ṩһ������������������Ի�ȡ�ö���

���裺
1��˽�л����๹�캯����
2��ͨ��new�ڱ����д���һ���������
3������һ�����еķ������������Ķ��󷵻ء�



*/

//����ʽ
class Single//��һ���أ�������Ѿ������ˡ�
{
	private static Single s = new Single();

	private Single(){}

	public static Single getInstance()
	{
		return s;
	}
}


//����ʽ
class Single2//����ؽ�����û�ж���ֻ�е�����getInstance����ʱ���Żᴴ������
			//�ӳټ�����ʽ�� 
{
	private static Single2 s = null;

	private Single2(){}

	public static Single2 getInstance()
	{
		if(s==null)
			s = new Single2();
		return s;
	}
}


class  SingleDemo
{
	public static void main(String[] args) 
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();

		System.out.println(s1==s2);
		
//		Single ss = Single.s;

//		Test t1 = new Test();
//		Test t2 = new Test();
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		t1.setNum(10);
		t2.setNum(20);
		System.out.println(t1.getNum());
		System.out.println(t2.getNum());
	}
}


class Test
{
	private int num;

	private static Test t = new Test();
	private Test(){}
	public static Test getInstance()
	{
		return t;
	}
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}

}
