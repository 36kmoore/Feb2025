package Pack1;

import java.util.*;

public class Lab1_9 {

	public static String stringOp (String str,int choice) {
		switch(choice) {
		case 1:
			System.out.println(str + str);
			break;
		case 2:
			System.out.println(changeOddHash(str));
			break;
		case 3:
			System.out.println(removeDupes(str));
			break;
		case 4:
			System.out.println(upperOdd (str));
			break;
			
		default:
			return "invalid Choice";
		}
		return null;
			
	}
	
	private static String changeOddHash(String str) {
		StringBuilder ss = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(i%2 != 0) {
				ss.append("#");
			}
			else {
				ss.append(str.charAt(i));
			}
		}
		return ss.toString();
	}
	
	private static String removeDupes(String str) {
		StringBuilder ss = new StringBuilder();
		Set<Character> seen=new HashSet<>();
		for(char c:str.toCharArray()) {
			if(!seen.contains(c)) {
				seen.add(c);
				ss.append(c);
			}
		}
		return ss.toString();
	}
	
	private static String upperOdd(String str) {
		StringBuilder ss = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(i%2 != 0) {
				ss.append(Character.toUpperCase(str.charAt(i)));
			}
			else {
				ss.append(str.charAt(i));
			}
		}
		return ss.toString();
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter a String");
		String str = scan.nextLine();
		System.out.println("Now please choose what you would like to do to that string:");
		System.out.println("1: Add the String to itself" + "\n"
		+ "2: Replace odd positions with #" + "\n"
		+ "3: Remove duplicate characters in the String" + "\n"
		+ "4: Change odd characters to upper case");
		int choice = scan.nextInt();
		stringOp(str, choice);
	}
}
