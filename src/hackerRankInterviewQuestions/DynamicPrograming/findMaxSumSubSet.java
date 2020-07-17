package hackerRankInterviewQuestions.DynamicPrograming;
/*
Given an array of integers, find the subset of non-adjacent
elements with the maximum sum. Calculate the sum of that subset.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class findMaxSumSubSet {
    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {

        int include = arr[0];
        int exclude = 0;
        int excludeNew;

        for(int i =1; i < arr.length; i++){
            excludeNew = (include > exclude)?include:exclude;

            include = exclude + arr[i];
            exclude = excludeNew;
        }

        return((include>exclude)?include:exclude);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = maxSubsetSum(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

/*
Input (stdin)
5
3 7 4 6 5
Expected Output
13
 */
