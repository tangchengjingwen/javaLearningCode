/*

Object:������ĸ��ࡣ

Object�ǲ��ϳ�ȡ�������߱������ж��󶼾߱��Ĺ������ݡ�

���õĹ��Թ��ܣ�






*/
/*
class Fu // extends Object
{
	Fu()
	{
		super();
	}
}
class Zi extends Fu
{
	Zi()
	{
		super();
	}
}
*/

class Person extends Object
{
	private int age;
	Person(int age)
	{
		this.age = age;
	}
	/*
	//�Ƚ�Person�����䡣�Ƿ���ͬ����
	public boolean compare(Person p)
	{
		return this.age == p.age;	
	}
	*/

	/*
	һ�㶼�Ḳ�Ǵ˷��������ݶ�����������ݣ������ж϶����Ƿ���ͬ�����ݡ�
	*/

	public boolean equals(Object obj)//Object obj = p2;
	{
		if(!(obj instanceof Person))
		{
//			return false;
			throw new ClassCastException("���ʹ���");
		}
		Person p = (Person)obj;
		return this.age == p.age;
	}
/*
	public int hashCode()
	{
		return age;
	}
*/

	public String toString()
	{
		return "Person :"+age;
	}
}
class Demo
{
}


class  ObjectDemo
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(60);
		Person p2 = new Person(20);
		Demo d = new Demo();
//		System.out.println(p1.equals(p2));

//		System.out.println(p1);
//		System.out.println(Integer.toHexString(p1.hashCode()));
			

//		Class clazz1 = p1.getClass();
//		Class clazz2 = p2.getClass();
//		System.out.println(clazz1==clazz2);
//		System.out.println(clazz1.getName());

		System.out.println(p1.toString());//Person@61de33
		System.out.println(p1.getClass().getName()+"$"+Integer.toHexString(p1.hashCode()));//Person@61de33



//		Person p3 = p1;

//		Demo d = new Demo();

//		System.out.println(p1==p2);
//		System.out.println(p1.equals(p2));
	}
}
