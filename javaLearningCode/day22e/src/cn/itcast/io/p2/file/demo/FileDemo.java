package cn.itcast.io.p2.file.demo;

import java.io.File;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		constructorDemo();
		
		
	}

	public static void constructorDemo() {
		
		//���Խ�һ���Ѵ��ڵģ����߲����ڵ��ļ�����Ŀ¼��װ��file����
		File f1 = new File("c:\\a.txt");
		
		File f2 = new File("c:\\","a.txt");
		
		File f = new File("c:\\");
		
		File f3 = new File(f,"a.txt");
		
		File f4 = new File("c:"+File.separator+"abc"+File.separator+"a.txt");
		System.out.println(f4);
		
		
	}
	
	

}
