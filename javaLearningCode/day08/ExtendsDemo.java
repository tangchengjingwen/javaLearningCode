
/*
�̳еĺô���
	1������˴���ĸ����ԡ�
	2����������֮������˹�ϵ����������������̬�ṩ��ǰ��.



java��֧�ֵ��̳С���ֱ��֧�ֶ�̳У�����C++�еĶ�̳л��ƽ��и�����

���̳У�һ������ֻ����һ��ֱ�Ӹ��ࡣ

��̳У�һ����������ж��ֱ�Ӹ���(java�в�����,���и���)
		��ֱ��֧�֣���Ϊ�������������ͬ��Ա����������ò�ȷ���ԡ�
		��java����ͨ��"��ʵ��"�ķ�ʽ�����֡�


java֧�ֶ��(����)�̳С�

C�̳�B��B�̳�A��
�ͻ���ּ̳���ϵ��

��Ҫʹ��һ���̳���ϵʱ��
1���鿴����ϵ�еĶ����࣬�˽����ϵ�Ļ������ܡ�
2��������ϵ�е������������ɹ��ܵ�ʹ�á� 

class Demo
{
	void show1(){}
}


class DemoA extends Demo
{
//	void show1(){}
	void show2(){}
}
class DemoB extends Demo
{
//	void show1(){}
	void show3(){}
}

ʲôʱ����̳��أ�

��������֮�������������ϵ��ʱ�򣬾Ͷ���̳С�xxx��yyy�е�һ�֡� xxx extends yyy

������ϵ�� is a ��ϵ��




*/
/*
class A
{
	void show()
	{
		System.out.println("a");
	}
}
class B 
{
	void show()
	{
		System.out.println("b");
	}
}
class C extends A,B
{
}
new C().show();
*/
class Person
{
	String name;
	int age;
}



class Student extends/*�̳�*/ Person
{
//	String name;
//	int age;
	void study()
	{
		System.out.println(name+"...student study.."+age);
	}
}


class Worker extends Person
{
//	String name;
//	int age;
	void work()
	{
		System.out.println("worker work");
	}
}


class ExtendsDemo 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.name= "zhangsan";
		s.age = 22;
		s.study();
	}
}
