public class hello {
    public static void main(String []args){
        System.out.println("test...");

        double [] list = {2 , 1.0, 3, 6, 4, 5};

        sortingArray.selectionSort(list);


        for (int i =0; i < list.length; i++){
            System.out.print(list[i]+" ");
        }
    }
}
