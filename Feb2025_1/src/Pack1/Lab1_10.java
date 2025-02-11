package Pack1;

import java.util.*;

public class Lab1_10 {
	
	static boolean is_pos_str (String str) {
		int str_len = str.length();
		for (int i = 1; i < str_len; i++) {
			str.replaceAll(" ", "");
			if(str.charAt(i) < str.charAt(i-1)) {
				return false;
			}
			if(str.isEmpty()) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter a String");
		String str = scan.nextLine();
		if (is_pos_str(str)) {
			System.out.println("The letters " + "\"" + str + "\"" + " are a positive String");
		} else {
			System.out.println("The letters " + "\"" + str + "\"" + " are NOT a positive String");
		}
	}

}
