/*
����һ�����飬������з�ת��

{3,1,6,5,8,2} --> 
{2,8,5,6,1,3};

��ʵ����ͷβԪ�ص�λ���û���

*/


class  ArrayTest
{
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
		int[] arr = {4,1,8,7,3,8,2};
		printArray(arr);
		reverseArray(arr);
		printArray(arr);
	}

	public static void reverseArray(int[] arr)
	{
		for(int start=0,end=arr.length-1; start<end; start++,end--)
		{
			swap(arr,start,end);
		}
	}
	public static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
