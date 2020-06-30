package hackerRankInterviewQuestions;
import java.util.Scanner;

public class solutionBubleSortSwapCounter {
    // Complete the countSwaps function below.
    static void countSwaps(int[] arr) {

        int size = arr.length;
        boolean swapped;
        int count = 0;

        for(int i = 0; i < size - 1; i++){
            swapped = false;

            for(int j = 0; j < size -1; j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                    count++;
                }
            }

            if(swapped == false){
                break;
            }
        }
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[size-1]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}


/*
Sample Input

3
1 2 3
-------------------------
Sample Output

Array is sorted in 3 swaps.
First Element: 1
Last Element: 3
 */