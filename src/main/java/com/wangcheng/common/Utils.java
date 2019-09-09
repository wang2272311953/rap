package com.wangcheng.common;

public class Utils {
	public static String toHtml(String text){
		String replaceAll = text.replaceAll("\n", "<p></p>");
		String all = replaceAll.replaceAll("\r", "<br>");
		String replace = all.replaceAll("\n\r", "\n");
		return replace;
	}
	public static boolean toPhone(String phone){
		String f="^1(3|5|7|8|9)[0-9]\\d{8}$";
		boolean matches = phone.matches(f);
		if (matches) {
			return true;
		}
		return false;
	}
	public static boolean isEmail(String email){
		String f="^([a-zA-Z0-9]+)@([a-zA-Z0-9]+\\.)(com|cn)$";
		
		boolean matches = email.matches(f);
		if (matches) {
			return true;
		}
		return false;
	}
}
