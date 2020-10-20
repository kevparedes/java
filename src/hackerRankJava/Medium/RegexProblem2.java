/*
	In this challenge, we use regular expressions (RegEx) to remove instances of 
	words that are repeated more than once, but retain the first occurrence of any
	case-insensitive repeated word. For example, the words love and to are repeated in the 
	sentence I love Love to To tO code. Can you complete the code in the editor so it will 
	turn I love Love to To tO code into I love to code?
	
	To solve this challenge, complete the following three lines:
	
	Write a RegEx that will match any repeated word.
	Complete the second compile argument so that the compiled RegEx is case-insensitive.
	Write the two necessary arguments for replaceAll such that each repeated word is replaced 
	with the very first instance the word found in the sentence. It must be the exact first 
	occurrence of the word, as the expected output is case-sensitive.
	Note: This challenge uses a custom checker; you will fail the challenge if you modify anything 
	other than the three locations that the comments direct you to complete. To restore the 
	editor's original stub code, create a new buffer by clicking on the branch icon in the top 
	left of the editor.
	
	Input Format
	
	The following input is handled for you the given stub code:
	
	The first line contains an integer, , denoting the number of sentences.
	Each of the  subsequent lines contains a single sentence consisting of English alphabetic 
	letters and whitespace characters.
	
	Sample Input 										|  Sample output
	=================================================================================================
	5													|	
	Goodbye bye bye world world world					|	Goodbye bye world
	Sam went went to to to his business					|	Sam went to his business
	Reya is is the the best player in eye eye game		|	Reya is the best player in eye game
	in inthe											|	in inthe
	Hello hello Ab aB									|	Hello Ab
 */
package Medium;
import java.util.*;
import java.util.regex.*;

public class RegexProblem2 {

	public static void main(String [] args) {
		/***************************************
			What the Regular Expression Means: 
		 ***************************************
		1.\b: look for word boundary (match only beginning of word instead of somewhere in 
		the middle);
		
		2.(\w+): match one ore more word characters and remember them as a group (the parens) 
		to which later we can refer to using a number; so this matches a complete word and 
		remembers it;
		
		3.\s+: match one or more space characters;
		
		4.\1: match the word remembered in step 2;
		
		5.\b: like in step 1 � make sure it�s not a part of some longer word;
		
		6.(\s+\1\b)+: match one or more occurrences of the word captured in step 2
		 */
		String regex = "\\b(\\w+)(\\s+\\1\\b)+";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());
		
		while(numSentences-- > 0) {
			String input = in.nextLine();
			Matcher m = p.matcher(input);
			
			while(m.find()) {
				input = input.replaceAll(m.group(), m.group(1));
			}
			
			System.out.println(input);
		}
		
		in.close();
	}
}
