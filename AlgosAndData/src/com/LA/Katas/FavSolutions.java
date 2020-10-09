package com.LA.Katas;

import java.math.BigInteger;
import static java.math.BigInteger.ZERO;
import static java.math.BigInteger.ONE;

public class FavSolutions {
		
	// 6 kyu sum of all the digits until one digit left !
	public static int digital_root(int n) {
    if (n == 0) { 
        return 0; 
    }
    else {
    return (n % 9 == 0) ? 9 : (n % 9); 
    }
  }  
	
	// 6 kyu checking if num is a triangle number in set A = {1, 3, 6, 10, 15 etc}
	// formula for such a number is (n*(n+1))/2 = member of A
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
	 
	 // 6 kyu prime number check
	 public static boolean isPrime(int num) {
	    if(num < 2) return false;
	    if(num == 2 || num == 3) return true;
	    if(num%2 == 0 || num%3 == 0) return false;
	    long sqrtN = (long)Math.sqrt(num)+1;
	    for(long i = 6L; i <= sqrtN; i += 6) {
	        if(num%(i-1) == 0 || num%(i+1) == 0) return false;
	    }
	    return true;
	  }
	 
	 // 5 kyu sum of perimeters of all squares in a rectangle
	 // learnt about BigInteger
	 public static BigInteger perimeter(BigInteger n){ 
    BigInteger a = ZERO, b = ONE, c = ONE;
		BigInteger sum = BigInteger.valueOf(0);
			for (int i = 1; i <= n.intValue()+1; i++) {
				a = b; 
				b = c; 
				c = a.add(b);
				sum = sum.add(a);
			}
		return sum.multiply(BigInteger.valueOf(4));
	 } 
	 
	 // 6 kyu find int occurring odd number of times 
	 // if XOR used and both sides are the same (ie even), returns 0. 
	 // same if both false. If any only if one side is true, returns 1.
	 // ie xor is X-clusively OR
	 public static int findIt(int[] A) {
	    int xor = 0;
	    for (int i = 0; i < A.length; i++) {
	      xor ^= A[i];
	    }
	    return xor;
	  }
	 
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

}
