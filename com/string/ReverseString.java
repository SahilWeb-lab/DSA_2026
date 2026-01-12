package com.string;

public class ReverseString {

	public static String reverseString(String s) {
		StringBuilder result = new StringBuilder();
		for(int i = s.length() - 1; i >= 0; i--) {
			result.append(s.charAt(i));
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		String name = "Sahil Mandal";
		String reverseString = reverseString(name);
		System.out.println(reverseString);
	}

}
