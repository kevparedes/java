public class genericSort {

    //generic sort method
    public static <E extends Comparable<E>> void sort(E[]list){

        E currentMin;

        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++){
            //Find the min in the list
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {

                if (currentMin.compareTo(list[j]) > 0 ){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex !=i){
                list[currentMinIndex]  = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void printList (Object[] list){
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer [] intArray = {3,2,4,1};

        Double [] dubArray = {3.0, 1.0, 2.1, -1.0};

        Character [] charArray = {'j','a','d','b'};

        String [] stringArray = {"Tom","Jerry","Adam"};

        sort(intArray);
        sort(dubArray);
        sort(charArray);
        sort(stringArray);


        System.out.print("Sorted integer objects ");
        printList(intArray);
        System.out.print("Sorted double Objects ");
        printList(dubArray);
        System.out.print("Sorted char Objects ");
        printList(charArray);
        System.out.print("Sorted array Objects ");
        printList(stringArray);
    }
}
