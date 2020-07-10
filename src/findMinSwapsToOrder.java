
public class findMinSwapsToOrder {

    static int minSwaps(int arr[]) {

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

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 6, 5};
        System.out.println("Min swaps " + minSwaps(arr));
    }

}
