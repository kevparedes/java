public class sortArrayEvenToOdd {

    public static void sort (int [] list, int size){

        for (int i = 0; i <size ; i++) {

            int currentMin = list[i];
            int currentIndex = i;

            for (int j = i + 1; j < size ; j++) {

                if (currentMin > list[j]){

                    currentMin = list[j];
                    currentIndex = j;

                }

            }
            if (currentIndex != i){

                list[currentIndex]=list[i];
                list[i]=currentMin;
            }

        }
    }


    public static void evenToOdd (int [] list, int size){

        int temp;
        int position = -1;

        for (int l = 0; l < size ; l++) {

            if (list[l] % 2 != 0 ){

                position++;

                temp = list[l];

                list [l] = list[position];

                list[position] = temp;

            }

        }

    }


    public static void main(String[] args) {


        int [] list = {3,5,2,1,8,4,6,7 };

        int size = list.length;

        //test output
        for (int k = 0; k <size ; k++) {

            System.out.print(list[k]+" ");

        }

        sort(list, size);
        evenToOdd(list, size);


        System.out.println();

        //test output
        for (int k = 0; k <size ; k++) {

            System.out.print(list[k]+" ");

        }

    }
}
