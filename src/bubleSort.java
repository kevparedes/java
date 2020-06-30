public class bubleSort {

    static void bubleSort(int [] arr){

        int size = arr.length;
        boolean swapped;

        for (int i = 0; i < size - 1 ; i++) {
            swapped =false;
            for (int j = 0; j < size -1 ; j++) {

                if (arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped =true;
                }

            }
            if (swapped == false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {3,1,2,5,6};


        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubleSort(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
