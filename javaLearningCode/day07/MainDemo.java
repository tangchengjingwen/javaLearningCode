/*
public static void main(String[] args) 

����������֮����
1����ʽ�ǹ̶��ġ�
2����jvm��ʶ��͵��á�

public:��ΪȨ�ޱ��������ġ�
static:����Ҫ�����,ֱ���������������������ü��ɡ�
void��������û�о���ķ���ֵ��
main:�����������ǹؼ��֣�ֻ��һ��jvmʶ��Ĺ̶������֡�
String[] args:�����������Ĳ����б���һ���������͵Ĳ���������Ԫ�ض����ַ������͡�

*/

class MainDemo 
{
	public static void main(String[] args) //new String[0]
	{
		/**/
//		System.out.println(args);//[Ljava.lang.String;@c17164
		System.out.println(args.length);
		for(int x=0; x<args.length; x++)
			System.out.println(args[x]);
		
	}
}



