package com.yuanzijian01.itcast.file;

import java.io.File;

public class Demo2 {
	private void mian() {
		// TODO Auto-generated method stub
		File file = new File(".");
		System.out.println("当前路径是: +" + file.getAbsolutePath());
		
		File file2 = new File("..\\..\\a.txt");
		System.out.println("存在么" + file2.exists());
		
	}
}
