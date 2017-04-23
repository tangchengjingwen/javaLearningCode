
/**
����һ�����ڲ�������Ĺ����࣬���а����ų����Ķ���������ĺ����磺��ֵ������� ��
@author ����
@version V1.0
*/

public class ArrayTool
{
	private ArrayTool(){}//�����еķ������Ǿ�̬�ģ����Ը����ǲ���Ҫ�Ĵ�������ġ�Ϊ�˱�֤���������ɴ����������
						//���Խ����캯��˽�л���

	/**
	��ȡ������������ֵ��
	@param arr ����һ��Ԫ��Ϊint���͵����顣
	@return �����������Ԫ��ֵ
	*/
	public static int getMax(int[] arr)
	{
		int maxIndex = 0;
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>arr[maxIndex])
					maxIndex = x;//
		}

		return arr[maxIndex];
	}
	/**
	���������ѡ������
	@param arr ����һ��Ԫ��Ϊint���͵����顣
	
	*/
	public static void selectSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
					swap(arr,x,y);
			}
		}
	}

	/*
	���ڸ��������Ԫ�ص�λ���û���
	@param arr ����һ��Ԫ��Ϊint���͵����顣
	@param a
	@param b
	
	*/
	private static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	/**
	��ȡָ����Ԫ����ָ�������е�����.
	@param arr ����һ��Ԫ��Ϊint���͵����顣
	@param key Ҫ�ҵ�Ԫ�ء�
	@return ���ظ�Ԫ�ص�һ�γ��ֵ�λ�ã���������ڷ���-1.
	*/
	public static int getIndex(int[] arr,int key)
	{
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x]==key)
				return x;
		}
		return -1;
	}

	/**
	��int����ת�����ַ�������ʽ�ǣ�[e1,e2,...]
	@param arr ����һ��Ԫ��Ϊint���͵����顣
	@return ���ظ�������ַ���������ʽ�� 
	*/
	public static String arrayToString(int[] arr)
	{
		String str = "[";

		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				str = str + arr[x]+", ";
			else
				str = str + arr[x]+"]";
		}
		return str;
	}
}