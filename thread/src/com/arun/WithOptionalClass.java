package com.arun;

import java.util.Optional;



public class WithOptionalClass {
static Optional<String> getDate(int id){
	if(id == 101) {
	return Optional.ofNullable("Zaid");
	}else {
		return Optional.ofNullable(null);
	}
	
}
public static void main(String[] args, Object name) {
	  System.out.println("Program starts...");

    
      Optional<String> optionalData = getDate(101);

     
      System.out.println(optionalData.orElse("No data"));

      System.out.println("Program end...");
      String[] array = {"Payal", "Komal", null, "Jyoti","Pari"};
      for (String name1: array) {
		
	}
      Optional<String> st = Optional.empty();
      if(st.isPresent()) {
    	  System.out.println(((String) name).toUpperCase());
      }
  }
}