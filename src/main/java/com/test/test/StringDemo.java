package com.test.test;

public class StringDemo {

	public static void main(String[] args) {
		System.out.println("hello");
		
		String s1 = new String("                  abhi");
		String s2 = new String("abhi");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("Length of s1 : "+s1.length());
		System.out.println(s1 = s1.trim());
		System.out.println(s1.charAt(1));
		System.out.println(s1.substring(1,4));
		System.out.println("contains method --------");
		System.out.println(s1.contains("b"));
		System.out.println(s1.contains("t"));
		System.out.println(s1.contains("bh"));
	
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		
		
		
		System.out.println();
		StringBuffer sb1 = new StringBuffer("abhi");
		StringBuffer sb2 = new StringBuffer("abhi");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		
		
	}

}
