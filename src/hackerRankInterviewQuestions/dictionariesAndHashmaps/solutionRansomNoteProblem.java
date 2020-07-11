package hackerRankInterviewQuestions.dictionariesAndHashmaps;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class solutionRansomNoteProblem {
    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        boolean ans =true;
        List<String> list1 = new ArrayList<String>(Arrays.asList(magazine));
        for (int i = 0; i < note.length; i++){
            if (list1.contains(note[i])){
                list1.remove(note[i]);
            }
            else {
                ans = false;
                break;
            }
        }
        if(ans == true){
            System.out.print("Yes");
        }
        else
            System.out.print("No");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
