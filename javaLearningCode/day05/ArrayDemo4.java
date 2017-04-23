import java.util.*;

class ArrayDemo4 
{

	//��������Ĺ��ܡ�
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+", ");
			else
				System.out.println(arr[x]+"]");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {34,19,11,109,3,56};

//		int max = getMax_2(arr);
//		System.out.println("max="+max);

		printArray(arr);

//		selectSort(arr);
//		bubbleSort(arr);
//		Arrays.sort(arr);
		selectSort_2(arr);

		printArray(arr);
	}

	public static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	/*
	ð������
	*/
	public static void bubbleSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=0; y<arr.length-1-x; y++)
			{
				if(arr[y]>arr[y+1])	
				{
					swap(arr,y,y+1);
					/*
					int temp  = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
					*/
				}
			}	
		}
	}


	/*
	ѡ������
	*/
	public static void selectSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
				{
					swap(arr,x,y);
					/*
					int temp  = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
					*/
				}
			}
		}
	}

	public static void selectSort_2(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			int num = arr[x];
			int index = x;
			for(int y=x+1; y<arr.length; y++)
			{
				if(num>arr[y])
				{
					num = arr[y];
					index = y;
				}
			}
			if(index!=x)
				swap(arr,x,index);
		}
	}


	/*
	��ȡ�����е����ֵ��
	˼·��
	1����Ҫ���бȽϡ������������¼סÿ�αȽϺ�ϴ��ֵ��
	2���������е�Ԫ�ؽ��б���ȡ�����ͱ����м�¼��Ԫ�ؽ��бȽϡ�
		�����������Ԫ�ش��ڱ����м�¼��Ԫ�أ����ñ�����¼ס�ô��ֵ�� 
	3������������ñ�����¼�������ֵ��

	����һ����������ʵ�֡�
	��ȷһ�������
			�������е�Ԫ�ء�int .
	��ȷ����δ֪���ݡ�
			����.
	*/
	public static int getMax(int[] arr)
	{
		//���������¼�ϴ��ֵ��
		int maxElement = arr[0];//��ʼ��Ϊ�����е�����һ��Ԫ�ء�
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>maxElement)
				maxElement = arr[x];
		}
		return maxElement;
	}
	public static int getMax_2(int[] arr)
	{
		//���������¼�ϴ��ֵ��
		int maxIndex = 0;//��ʼ��Ϊ����������һ���Ǳꡣ
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>arr[maxIndex])
				maxIndex = x;
		}
		return arr[maxIndex];
	}
}
