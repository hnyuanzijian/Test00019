package com.yuanzijian01.itcast.file;

import java.io.File;

public class Demo2 {
	private void mian() {
		// TODO Auto-generated method stub
		File file = new File(".");
		System.out.println("��ǰ·����: +" + file.getAbsolutePath());
		
		File file2 = new File("..\\..\\a.txt");
		System.out.println("����ô" + file2.exists());
		
	}
}
