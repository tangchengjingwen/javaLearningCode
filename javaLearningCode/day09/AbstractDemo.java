
/*
�����ࣺ
������ͳ��ģ�����������������塣



�ص㣺
1������ֻ������û��ʵ��ʱ���÷������ǳ��󷽷�����Ҫ��abstract���Ρ�
	���󷽷����붨���ڳ������С��������Ҳ��abstract���Ρ�
2�������಻���Ա�ʵ������Ϊʲô����Ϊ���ó��󷽷�û���塣
3������������������า�������еĳ��󷽷��󣬸�����ſ���ʵ������
	����������໹�ǳ����ࡣ


1�����������й��캯����
	�У����ڸ����������г�ʼ����


	
2����������Բ�������󷽷���
	���Եġ� ���Ǻ��ټ���Ŀ�ľ��ǲ��ø��ഴ������AWT��������������������ࡣ
	ͨ��������еķ����з����壬����ȴû�����ݡ�

	abstract class Demo
	{
		void show1()
		{}
		

		void show2()
		{}
	}



3������ؼ��ֲ����Ժ���Щ�ؼ��ֹ���?
	private ����
	static	����
	final	����



4���������һ�������ͬ�㡣
	��ͬ�㣺
		�������һ���඼��������������ģ������ڲ����˳�Ա��
	��ͬ��
		1��һ�������㹻����Ϣ�������
		   �����������������Ϣ�п��ܲ��㡣
		2��һ�����в��ܶ�����󷽷���ֻ�ܶ��ǳ��󷽷���
		   �������пɶ�����󷽷���ͬʱҲ���Զ���ǳ��󷽷���
		3��һ������Ա�ʵ������
		   �����಻���Ա�ʵ������




5��������һ���Ǹ�������
	�ǵġ���Ϊ��Ҫ���า���䷽����ſ��Զ�����ʵ������ 




*/

abstract class Demo
{
	abstract /*����*/ void show();
	
}

/*

class DemoA extends Demo
{
	void show()
	{
		System.out.println("demoa show");
	}
}
class DemoB extends Demo
{
	void show()
	{
		System.out.println("demob show");
	}
}
*/
abstract class Ȯ��
{
	abstract void ���();
}

class �� extends Ȯ��
{
	
	void ���()
	{
		System.out.println("����");
	}
}
class �� extends Ȯ��
{
	void ���()
	{
		System.out.println("��");
	}
}



class AbstractDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


