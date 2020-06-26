public class sortArrayWithOddNumbersInFront {

    public static void sort(int [] array){


        for (int i = 0; i < array.length; i++) {

            int currentMin = array[i];

            int index = i;

            for (int j = i + 1; j < array.length; j++) {

                if (currentMin > array[j]){

                    currentMin = array[j];
                    index = j;


                }
            }

            if (index != i){

                array[index] = array [i];

                array[i]=currentMin;
            }
        }

    }

    public static void sortOddToEven(int [] array){

        int temp;
        int index = -1;

        for (int i = 0; i <array.length ; i++) {

            if (array[i] % 2 != 0){

                index++;

                temp = array[i];

                array[i] = array [index];

                array[index] =temp;
            }
        }
    }

    public static void main(String[] args) {

        int [] list = {1,4,3,9,7,6,12};

        sort(list);

        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i] + " ");
        }

        sortOddToEven(list);
        System.out.println();

        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
