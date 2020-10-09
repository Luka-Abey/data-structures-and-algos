package com.LA.Katas;

public class FavSolutions {
	
	// 8 kyu int to binary
	public static int toBinary(int n) {
    String s = "";
    while (n > 0)
    {
        s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
        n = n / 2;
    }
    return Integer.parseInt(s);
  }
	
	
	// 6 kyu sum of all the digits until one digit left !
	public static int digital_root(int n) {
    if (n == 0) { 
        return 0; 
    }
    else {
    return (n % 9 == 0) ? 9 : (n % 9); 
    }
  }  
	
	
	 public static Boolean isTriangleNumber(long num) { 
	    if (num < 0) 
	      return false; 
	    
	    else {
	      for(long n = 0; n < num/2; n++){
	        if (n*(n + 1) == 2*num)
	          return true;
	        else continue;
	      }
	    }
	    return false;
	    } 

}
