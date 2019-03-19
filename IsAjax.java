package com.utils;

import javax.servlet.http.HttpServletRequest;

public class IsAjax {
	public static boolean isAjaxRequest(HttpServletRequest request) {
		String requestType = request.getHeader("X-Requested-With");
		// 如果requestType能拿到值，并且值为 XMLHttpRequest表示客户端的请求为异步请求，那自然是ajax请求了，反之如果为null,则是普通的请求
		if (requestType == null) {
			return false;
		}
		return true;
	}
}
