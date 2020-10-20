/*
 * Given a string A, print Yes if it is a palindrome, print No otherwise.
 *  
 * Sample Input:				|		Expected Output
 * 	-----------------------------------------------------------
 *  madam						|		true
 *  java                        |       False
 */
package Easy;
import java.util.*;

public class StringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String answer= "";
		int n = A.length();
		/* Enter your code here. Print output to STDOUT. */
		for (int i = 0; i < n;i++,n--) {
			if(A.charAt(i) == A.charAt(n -1)) {
				answer = "Yes";
			}
			else 
				answer = "No";
		}
		sc.close();
		System.out.println(answer);
	}
}
