package com.string;

public class CheckForRotation {

	 public static boolean areRotations(String s1, String s2) {
		 if(s1 == null || s2 == null) return false;
		 if(s1.length() != s2.length()) return false;
		 if(s1.length() == 0) return false;
		 return (s1+s1).contains(s2);
	 }
	
	public static void main(String[] args) {
		String str = "abba";
		String str2 = "baba";
		System.out.println(areRotations(str, str2));
	}

}
