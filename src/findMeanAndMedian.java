public class findMeanAndMedian {

    public static void sort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int currentMin = arr[i];
            int currentIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (currentMin > arr[j]) {

                    currentMin = arr[j];
                    currentIndex = j;

                }

            }
            if (currentIndex != i) {

                arr[currentIndex] = arr[i];
                arr[i] = currentMin;
            }

        }
    }

    public static int median (int [] arr , int d){

        int median = 0;

        sort(arr);


        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

        while (d < arr.length) {
            if (d % 2 == 0) {

                median = arr[(d - 1) / 2];
                System.out.println();
                System.out.println(median);
            } else {
                median = arr[d / 2];
                System.out.println();
                System.out.println(median);
            }
            d++;
        }

        return median;
    }

    public static int notification ( int [] arr, int d){

        int notification = 0;

        for (int i = d; i < arr.length; i++) {

            System.out.println("This is the next value " + arr[i] + " " +" this is the median "+ median(arr, d) *2);
            if (arr[i] > median(arr, d ) * 2){
                System.out.print(arr[i] +" ");
                notification++;
                System.out.println("added 1 not");
                d = d+1;
            }
        }
        return notification;
    }


    public static void main(String[] args) {

        int [] arr = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        //int[] arr = {10, 20, 30, 40, 50};
        int d = 5;
        //int d = 3;

        System.out.println(" This is the notification " + notification(arr, d));

//        int n = arr.length;

//        int temp;
//
//        int index;
//
//        int median;
//
//        int count = 0;


//        while (d < n) {
//
//            for (int j = 0; j < d; j++) {
//
//                temp = arr[j];
//                index = j;
//
//                for (int k = 1; k < d; k++) {
//
//                    if (temp > arr[k]) {
//                        temp = arr[k];
//                        index = k;
//                    }
//                }
//
//                if (index != j) {
//                    arr[index] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//
//            for (int z = 0; z < n; z++) {
//                System.out.print(arr[z] + " ");
//
//            }
//
//            if (d % 2 != 0) {
//
//                median = arr[d / 2];
//                System.out.println(median);
//            } else {
//                median = arr[(d - 1) / 2];
//                System.out.println(median);
//            }
//
//            if (d + 1 > 2 * median) {
//
//                System.out.println(d + " > " + 2 * median);
//                count++;
//            }
//
//            d++;
//        }
//
//        System.out.println(count);
   }
}
