
/*
�ˣ�
���ԣ�
	���䡣

��Ϊ��
	˵����

*/

/*
private:˽�У���һ��Ȩ�����η����������γ�Ա��
		˽�е�����ֻ�ڱ�������Ч��

ע�⣺˽�н����Ƿ�װ��һ�����ֶ��ѡ�


*/
class Person
{
	private /*˽��*/int age;

	public void setAge(int a)//setXxx getXxx
	{
		age = a;
	}
	public int getAge()
	{
		return age;
	}
	/*
	public void haha(int a)
	{
		if(a>0 && a<130)
		{
			age = a;
			speak();
		}
		else
			System.out.println("���������");
	}
	*/
	void speak()
	{
		System.out.println("age="+age);
	}
}

class  PersonDemo
{
	public static void main(String[] args) 
	{
		Person p = new Person();
//		p.age = -20;
		p.haha(-20);
//		p.speak();
	}

	public static void selectSort(int[] arr){}

	private static void swap(int[] arr,int a,int b){}
}
