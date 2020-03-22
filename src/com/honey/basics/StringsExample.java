package com.honey.basics;

public class StringsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc;
		abc = "DDDghvhgj";

		String bcd = "fghfghDDDgfh";

		System.out.println(abc);
		System.out.println(bcd);
		System.out.println(abc + bcd);
		abc.toUpperCase();
		bcd.toLowerCase();
		System.out.println(abc.toUpperCase() + "         " + "to lowercase : " + bcd.toLowerCase());

		// compare two strings
		String a = "apple";
		String b = "Apple";
		System.out.println("using equal mathod we comparning a & b strings ");
		if (a.equals(b)) {
			System.out.println("both strings are  matching or  equal");
		} else {
			System.out.println("both strings are not matching or not equal");

		}
	// comparing using equal case
		if (a.equalsIgnoreCase(b)) {
			System.out.println("both strings are  matching or  equal********");
			
		} else {
			System.out.println("both strings are not matching or not equal********************");
		}
		
		
		String myname = "My Name is honey gupta" ;
		
		if (myname.contains("gupta")) {
			System.out.println("String contains 'gupta' text*******");
		} else {
			System.out.println("String contains NOT  'gupta' text*******");
		}
		
		int d = 90;
		int e = 80;		
		int f = d+e;
		System.out.println(f);//170
		String g ="30";
		System.out.println(f+g);//17030
		//Convert String to int
		int h = Integer.parseInt(g);
		System.out.println(f+h);//200
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
