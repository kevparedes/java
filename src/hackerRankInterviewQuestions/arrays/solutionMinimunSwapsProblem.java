package hackerRankInterviewQuestions.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class solutionMinimunSwapsProblem {
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int count = 0;
        int i = 0;

        while (i < arr.length) {

            //if current element is
            //not at the right position
            if (arr[i] != i + 1) {

                while (arr[i] != i + 1) {
                    int temp = 0;

                    //Swap current element
                    //with correct position
                    //of the element
                    temp = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = temp;
                    count++;
                }
            }
            i++;
        }
        return count;
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

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
