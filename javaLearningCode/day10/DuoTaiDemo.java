
/*

����Ķ�̬�ԡ�

class ����
{}

class è extends ����
{}

class �� extends ����
{}



è x = new è();

���� x = new è();//һ������������̬��



è�������Ｔ�߱���è����̬���־߱��Ŷ������̬��
����Ƕ���Ķ�̬�ԡ� 

��˵������һ�������Ӧ�Ų�ͬ����. 

��̬�ڴ����е����֣�
	������߽ӿڵ�����ָ��������Ķ���


��̬�ĺô���
	����˴������չ�ԣ�ǰ�ڶ���Ĵ������ʹ�ú��ڵ����ݡ�

��̬�ı׶ˣ�
	ǰ�ڶ�������ݲ���ʹ��(����)����������������ݡ�

��̬��ǰ�᣺
	1�������й�ϵ���̳У�ʵ�֡�
	2��Ҫ�и��ǡ� 



*/

abstract class Animal
{
	abstract void eat();

}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("�й�ͷ");
	}
	void lookHome()
	{
		System.out.println("����");
	}
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("����");
	}
	void catchMouse()
	{
		System.out.println("ץ����");
	}
}

class Pig extends Animal
{
	void eat()
	{
		System.out.println("����");
	}
	void gongDi()
	{
		System.out.println("����");
	}
}



class DuoTaiDemo 
{
	public static void main(String[] args) 
	{
		
//		Cat c = new Cat();
//		c.eat();
//		c.catchMouse();

		Animal a = new Cat(); //�Զ�����������è���������˶������͡��������й����޷�s���ʡ�
							//���þ������ƶ����й��ܵķ��ʡ�
							//רҵ��������ת�͡������������ء��Ͳ���ʹ����������з�����


//		a.eat();

		//��������þ��嶯��è�����й��ܡ� 
		//����Խ��ö����������ת�͡�
//		Cat c = (Cat)a;//����ת�͵�Ŀ����Ϊ��ʹ�������е����з�����
//		c.eat();
//		c.catchMouse();

//		ע�⣺����ת�ͣ���ʼ���ն�������������������͵ı仯��
//		Animal a1 = new Dog();
//		Cat c1 = (Cat)a1;//ClassCastException


		/*
		Cat c = new Cat();

//		Dog d = new Dog();

//		c.eat();
		method(c);
//		method(d);
//		method(new Pig());
		*/

		method(new  Dog());

	}

	public static void method(Animal a)//Animal a = new Dog();
	{
		a.eat();

		if(a instanceof Cat)//instanceof�������ж϶���ľ������͡�ֻ�������������������ж�
//						//ͨ��������ת��ǰ���ڽ�׳�Ե��жϡ�

		{
			Cat c = (Cat)a;
			c.catchMouse();
		}
		else if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.lookHome();
		}
		else
		{
		
		}
		
	}
	/*
	public static void method(Cat c)
	{
		c.eat();
	}
	public static void method(Dog d)
	{	
		
	}
	*/	
}
