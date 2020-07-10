
public class findMinValueInArray {

    static int findMin (int arr []){

        int minVal = arr[0];
        int index = 0;

        for (int i = 1; i <arr.length ; i++) {
            if (minVal > arr[i]){
                minVal = arr[i];
                index = i;
            }
        }
        System.out.println(index);
        return minVal;

    }

    public static void main(String[] args) {

        int [] arr = {4, 3, 9, 2};

        System.out.println("The min value is " +findMin(arr));
    }
}
