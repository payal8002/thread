package com.arun;

public class OptionalClassDemo {
static String getDate(int id) {
	if(id == 101) {
		return "Payal";
	}else{
	return null;
	}
}
public static void main(String[] args) {
	System.out.println("Program starts...");
	
	String data = getDate(100);
	if(data!=null) {
		System.out.println(data.toUpperCase());
	}else {
		System.out.println("No data");
	}
	System.out.println("Program end...");
}
}
