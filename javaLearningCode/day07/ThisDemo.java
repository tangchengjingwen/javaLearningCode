

/*
����Ա�����;ֲ����������������ùؼ���this�����֡�

this : ������󡣴����ĸ������أ���ǰ����
	   this�������ں���������������á�
	   ��˵���ĸ����������this���ڵĺ�����this�ʹ����ĸ�����

thisҲ���������ڹ��캯���е����������캯����
ע�⣺ֻ�ܶ����ڹ��캯���ĵ�һ�С���Ϊ��ʼ������Ҫ��ִ�С�
*/

class Person
{
	private String name;
	private int age;	
	Person()
	{		
		name = "baby";
		age = 1;
		System.out.println("person run");
	}	
	Person(String name)	
	{
		this();
		this.name = name;
	}
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;		
	}
	public void speak()
	{
		System.out.println(this.name+":"+this.age);
	}

	/*
	�ж��Ƿ���ͬ���ˡ�
	*/
	public boolean compare(Person p)
	{
		/*
		if(this.age==p.age)
			return true;
		else
			return false;
		*/
		return this.age==p.age;
	}

}

class ThisDemo 
{
	public static void main(String[] args) 
	{

		Person p1 = new Person("aa",30);//
		Person p2 = new Person("zz",12);

		p2.compare(p1);
//		new Person();
//		Person p = new Person("����",30);
//		p.speak();
//		Person p1 = new Person("Сǿ");
//		p1.speak();
	}
}
