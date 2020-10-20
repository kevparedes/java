package Medium;
/*
 * Write a class called MyRegex which will contain a string pattern. 
 * You need to write a regular expression and assign it to the pattern 
 * such that it can be used to validate an IP address. Use the following 
 * definition of an IP address:
 * ======================================================================================
 * IP address is a string in the form "A.B.C.D", where the value of A, B, C, 
 * and D may range from 0 to 255. Leading zeros are allowed. The length of 
 * A, B, C, or D can't be greater than 3.
 * 
 * Sample Input:						|		 Expected Output
 * 	-------------------------------------------------------------------------------------
 *  000.12.12.034						|		true
 *	121.234.12.12						|		true
 *	23.45.12.56							|		true
 *	00.12.123.123123.123				|		false
 *	122.23								|		false
 *	Hello.IP							|		false
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProb1 {
	public static boolean MyRegex(String str) {
		
		String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
		String regex = zeroTo255 + "\\."
					 + zeroTo255 + "\\."
					 + zeroTo255 + "\\."
					 + zeroTo255; 
		Pattern pattern = Pattern.compile(regex);
		if(str == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(str);
		
		return matcher.matches();
	}
	
	public static void main (String [] args) {
		//Hacker Rank Scanner
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNextLine()) {
//			String IP = sc.next();
//			System.out.println(IP.matches(new MyRegex().patter));
//		}
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(MyRegex(str));
		
		sc.close();
	}
}
