package com.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encode {
	public static String encode(String pswd) {

		try {
			MessageDigest instance = MessageDigest.getInstance("MD5");
			byte[] bs = instance.digest(pswd.getBytes());
			/**
			 * byte b 1111 1111 int b 0000 0000 0000 0000 0000 0000 1111 1111 int 255 0000
			 * 0000 0000 0000 0000 0000 1111 1111
			 * &-------------------------------------------------- 0000 0000 0000 0000 0000
			 * 0000 1111 1111
			 */
			String str = "";
			for (byte b : bs) {
				int temp = b & 255;
				if (temp >= 0 && temp <= 15) {
					str = str + "0" + Integer.toHexString(temp);
				} else {
					str = str + Integer.toHexString(temp);
					;
				}
			}
			return str;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "";
		}

	}
}
