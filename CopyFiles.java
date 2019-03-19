package com.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
	public static void copyFiles(File myFile, String path) throws IOException {
		// 字节缓冲区流
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(myFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
		// 一次读取一个字节数组
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}
		// 关闭流
		bos.close();
		bis.close();
	}
}
