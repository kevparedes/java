public class findMeanAndMedian {

    public static void main(String[] args) {

        int [] arr = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        int d = 5;
        int n = arr.length;

        int temp ;

        int index ;

        int median;

        int count = 0;


        while (d < n) {

            for (int j = 0; j < d ; j++) {

                    temp = arr[j];
                    index = j;

                for (int k = 1; k < d ; k++) {

                    if (temp > arr[k]){
                        temp = arr[k];
                        index = k;
                    }
                }

                if (index != j){
                    arr[index]= arr[j];
                    arr [j] = temp;
                }
            }

            if (d % 2 != 0){

                median = arr[d /2];
            }
            else {
                median = arr[(d  - 1) / 2];
            }

            if (d + 1 > 2 * median){

                System.out.println(d +" > "+ 2*median);
                count++;
            }

            d++;
        }

        System.out.println(count);
    }
}
