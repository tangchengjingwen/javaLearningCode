/*
��Աʾ����
���󣺹�˾�г���Ա�����������ţ�нˮ���������ݡ�
��Ŀ������������������ţ�нˮ�����н��𣬹������ݡ�
�Ը�������������ݽ�ģ��



������
��������������У����ҳ��漰�Ķ���
ͨ��������������
����Ա��
	���ԣ����������ţ�нˮ��
	��Ϊ��������
����
	���ԣ����������ţ�нˮ������
	��Ϊ��������


����Ա�;���������ֱ�Ӽ̳й�ϵ��

���ǳ���Ա�;���ȴ���й������ݡ�
���Խ��г�ȡ����Ϊ���Ƕ��ǹ�˾�Ĺ�Ա 

���Խ�����Ա�;�����г�ȡ.������ϵ.
	
*/

//������Ա��

abstract class Employee
{
	private String name;
	private String id;
	private double pay;
	Employee(String name,String id,double pay)
	{
		this.name = name;
		this.id = id;
		this.pay = pay;
	}

	public abstract void work();
	
}


//��������Ա��
class Programmer extends Employee
{
	Programmer(String name,String id,double pay)
	{
		super(name,id,pay);
	}
	public void work()
	{
		System.out.println("code...");
	}
}

//�������� 
class Manager extends Employee
{
	private int bonus;
	Manager(String name,String id,double pay,int bonus)
	{
		super(name,id,pay);
		this.bonus = bonus;
	}
	public void work()
	{
		System.out.println("manage");
	}
}






class  AbstractTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


class Person
{
	private String name;
	private int age;

	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
class Student extends Person
{
	Student(String name,int age)
	{
		super(name,age);
	}

}
class Worker extends Person
{
	Worker(String name,int age)
	{
		super(name,age);
	}

}