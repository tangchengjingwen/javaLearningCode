
/*
�ʼǱ�����ʹ�á�
Ϊ����չ�ʼǱ��Ĺ��ܣ����պ����ʲô�����豸��֪����

����һ������ֻҪ�պ���ֵ��豸�������������Ϳ����ˡ�
������java�о��ǽӿڡ�

*/
interface USB// ��¶�Ĺ���
{
	public void open();
	public void close();
}


class BookPC
{
	public static void main(String[] args)
	{
		useUSB(new UPan());//������չ�ˡ�
		useUSB(new UsbMouse());
	}

	//ʹ�ù���
	public static void useUSB(USB u)//�ӿ����͵����ã����ڽ���(ָ��)�ӿڵ��������//USB u= new UPan();
	{
		if(u!=null)
		{
			u.open();
			u.close();
		}
	}
}
//һ���------------------------------
//ʵ�ֹ���

//��Щ�豸�͵��Ե�����Խ����ˡ�

class UPan implements USB
{
	public void open()
	{
		System.out.println("upan open");
	}
	public void close()
	{
		System.out.println("upan close");
	}

}


class UsbMouse implements USB
{
	public void open()
	{
		System.out.println("UsbMouse open");
	}
	public void close()
	{
		System.out.println("UsbMouse close");
	}

}








/*
class Mouse
{
}

class BookPC
{
	public static void main(String[] args)
	{
		useMouse(new Mouse());
	}
	public static void useMOuse(Mouse m)
	{
		m.open();
	}
	public static void useMOuse(Mouse m)
	{
		m.open();
	}
}
*/