package com.substring;

public class Substrings {
	 public static void main(String[] args) {
	 String s = "1102021222";
     System.out.println(s.substring(0,1+1));
     System.out.println(s.substring(0,5+1));
     System.out.println(s.substring(1,6+1));
     System.out.println(s.substring(2,5+1));
     System.out.println(s.substring(7,8+1));
     System.out.println(s.substring(8,9+1));
     int k = 2;
    
     System.out.println("The perfectsubstring is:"+perfectSubstring(s, k));
 }


	  public static int perfectSubstring(String s, int k){
	   int res = 0;
		for(int i=0; i<s.length(); i++) {
			int[] arr = new int[10];
			for(int j = i; j<s.length(); j++) {
				if(j > i + (10*k)) break;
				char ch = s.charAt(j);
				arr[ch-'0']++;
				if(check(arr, k)) 
				res++;
			}
		}
		return res;
	}

	 public static boolean check(int[] arr, int k) {
		for(int val : arr) {
			if(val != 0 && val != k)
			return false;
		}
		return true;
	}
	

}
