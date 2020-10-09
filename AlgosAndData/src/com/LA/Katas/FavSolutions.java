package com.LA.Katas;

public class FavSolutions {
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
