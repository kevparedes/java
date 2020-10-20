package hackerRankWarmUpQuestions;

public class sockMatch {

    static  void matchCounter(int arr [], int size){
        int result = 0;
        int currentNum;
        int position;

        for (int i = 0; i < size ; i++) {
            currentNum = arr[i];
            position = i;

            for (int j = 1; j <size ; j++) {

                if (currentNum > arr[j]){
                    currentNum = arr [j];
                    position = j;
                }
            }
            if (position != i){
                arr[position] = arr [i];
                arr[i] = currentNum;
            }
        }

        /*
        test
         */

        for (int k = 0; k < size ; k++) {
            System.out.print(arr[k] +" " );
        }
        System.out.println();
        System.out.println("Number of pairs: " + result);
    }

    public static void main(String[] args) {

        int arr [] = {10 , 20, 10, 20, 30, 50, 10 , 10};

        int size = 8;

        matchCounter(arr, size);
    }
}
