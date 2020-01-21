package com.ats.rusasoftapi.common;

import java.util.Random;

public class Commons {
	public  static String getAlphaNumericString(int n) 
	{ 

		// chose a Character random from this String 
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
									+ "0123456789"
									+ "abcdefghijklmnopqrstuvxyz"; 

		// create StringBuffer size of AlphaNumericString 
		StringBuilder sb = new StringBuilder(n); 

		for (int i = 0; i < n; i++) { 

			// generate a random number between 
			// 0 to AlphaNumericString variable length 
			int index 
				= (int)(AlphaNumericString.length() 
						* Math.random()); 

			// add Character one by one in end of sb 
			sb.append(AlphaNumericString 
						.charAt(index)); 
		} 

		return sb.toString(); 
	}
	
	
	
	 public static char[] OTP(int len) 
	    { 
		 char[] otp = new char[len]; 
		 try {
	        System.out.println("Generating OTP using random() : "); 
	  
	        // Using numeric values 
	        String numbers = "0123456789"; 
	  
	        // Using random method 
	        Random rndm_method = new Random(); 
	  
	       
	  
	        for (int i = 0; i < len; i++) 
	        { 
	            // Use of charAt() method : to get character value 
	            // Use of nextInt() as it is scanning the value as int 
	            otp[i] = 
	             numbers.charAt(rndm_method.nextInt(numbers.length())); 
	        } 
		 }catch (Exception e) {
			System.err.println("ex in comm OTP gen " +e.getMessage());
			e.printStackTrace();
		}
	        return otp; 
	    } 
}
