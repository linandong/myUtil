package com.utils;

public class IsEmptyForString {
	public static boolean isNotEmpty(String string) {
		if (string != null && !"".equals(string)) {
			return true;
		} else {
			return false;
		}
	}
}
