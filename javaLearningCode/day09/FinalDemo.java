//�̳б׶ˣ������˷�װ�ԡ�
/*
final�ؼ��֣�
1��final��һ�����η������������࣬������������
2��final���ε��಻���Ա��̳С�
3��final���εķ��������Ա����ǡ�
4��final���εı�����һ��������ֻ�ܸ�ֵһ�Ρ�
	ΪʲôҪ��final���α�������ʵ�ڳ������һ�������ǹ̶��ģ�
	��ôֱ��ʹ��������ݾͿ����ˣ����������Ķ��Բ������������������ơ�
	��������������Ƶ�ֵ���ܱ仯�����Լ���final�̶���

	д���淶������������ĸ����д��������ʣ��м���_���ӡ�



*/
class Fu
{
	void method()
	{
		//�����˵ײ�ϵͳ����Դ��
	}
}
class Zi extends Fu
{
	public static final double MY_PI = 3.14;
	static final int x = 7;

	void method()
	{
//		final int x = 9;
//		x = 9;
		final int NUMBER = 9;
		
		System.out.println(MY_PI);
	}
}

class FinalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
