class ArrayDemo3
{
	public static void main(String[] args) 
	{
		//��ʽ1
		/*
		��Ҫһ�����������ǲ���ȷ�����ľ������ݡ�
		*/
//		int[] arr = new int[3];


		/*
		��Ҫһ���������洢��֪�ľ������ݡ�
		*/
		//Ԫ������[] ������ = new Ԫ������[]{Ԫ�أ�Ԫ�أ�����};
//		int[] arr = new int[]{89,34,270,17};
		int[] arr = {89,34,270,17};

		/*
		���������������Ķ������Ǵ��ȡ��
		����˼�룺���ǶԽǱ�Ĳ�����
		
		*/

		System.out.println("length:"+arr.length);
		for(int x=0; x<arr.length ; x++)
		{
			System.out.println("arr["+x+"] = "+arr[x]+";");//arr[0] = 89;
		}

		for(int x=arr.length-1; x>=0; x--)
		{
			System.out.println("arr["+x+"] = "+arr[x]+";");//arr[0] = 89;
		}
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
		





	}
}
