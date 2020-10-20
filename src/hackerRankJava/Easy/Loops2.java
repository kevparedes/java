package Easy;
import java.util.*;

/*
	We use the integers , , and  to create the following series:
	
	You are given  queries in the form of , , and . For each query, print the 
	series corresponding to the given , , and  values as a single line of  space-separated 
	integers.
	
	Input Format
	
	The first line contains an integer, , denoting the number of queries.
	Each line  of the  subsequent lines contains three space-separated integers describing 
	the respective , , and  values for that query.
		
	Output Format
	
	For each query, print the corresponding series on a new line. Each series must be 
	printed in order as a single line of  space-separated integers.
	
	Sample Input 			|  Sample output
	================================================================
	2						|	
	0 2 10					|	2 6 14 30 62 126 254 510 1022 2046
	5 3 5					|	8 14 26 50 98								
 */
public class Loops2 {
	public static void series(int a, int b, int c) {
		int num = 0;
		int result = 0;
		for(int i = 0; i < c; i++) {
			num += (int) (Math.pow(2, i) * b);
			result = a + num;
			System.out.print(result + " ");
		}
		System.out.println();
	}
	public static void main (String []args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int i=0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			series(a, b, c);
		}
		in.close();
		
	}
}
