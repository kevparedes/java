package Easy;
/*
	The challenge here is to read n lines of input until you 
	reach EOF, then number and print all n lines of content.

	Hint: Java's Scanner.hasNext() method is helpful for this problem.

	Input Format

	Read some unknown n lines of input from stdin(System.in) 
	until you reach EOF; each line of input contains a non-empty 
	String.

	Output Format

	For each line, print the line number, followed by a single space, and then the line content received as input.
	=============================================
	Sample Input 				|  Sample output
	=============================================
	Hello world					|	1 Hello world
	I am a file					|	2 I am a file
	Read me until end-of-file.	|	3 Read me until end-of-file.
 */
import java.util.*;

public class EndOfFile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a;
		int i = 1;
		while(in.hasNext()) {
			a = in.nextLine();
			System.out.println(i + " "+ a);
			i++;
		}
		in.close();
	}
}
