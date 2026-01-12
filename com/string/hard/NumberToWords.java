package com.string.hard;

public class NumberToWords {

	private final String[] belowTen = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	private final String[] belowTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	private final String[] belowHundred = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	
	 public String numberToWords(int num) {
		 if(num == 0) return "Zero";
		 return helper(num);
	 }	
	 
	 private String helper(int num) {
		StringBuilder result = new StringBuilder();
		
		if(num < 10) result.append(belowTen[num]);
		else if(num < 20) result.append(belowTwenty[num - 10]);
		else if(num < 100) result.append(belowHundred[num / 10] + " ").append(helper(num % 10));
		else if(num < 1000) result.append(helper(num / 100)).append(" Hundred ").append(helper(num % 100));
		else if(num < 1000000) result.append(helper(num / 1000)).append(" Thousand ").append(helper(num % 1000));
		else if(num < 1000000000) result.append(helper(num / 1000000)).append(" Million ").append(helper(num % 1000000));
		else 
			result.append(helper(num / 1000000000)).append(" Billion ").append(helper(num % 1000000000));
		return result.toString().trim();
	}

	public static void main(String[] args) {
		int num = 2100000007;
		NumberToWords obj = new NumberToWords();
		String numberToWords = obj.numberToWords(num);
		System.out.println(numberToWords);
	}
	
}
