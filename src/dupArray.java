public class dupArray {
    public static void main(String[] args) {

        int [] array = {1 , 2 ,3 ,4 ,5};

        int [] newArray = new int[array.length];

        for (int i = 0 ; i < array.length; i ++){
            newArray[i] = array[i];

            System.out.println("old array " + array[i]);

            System.out.println("new array " + newArray[i]);
        }

        //This is another way on how to duplicate an array
        System.arraycopy(array, 0, newArray, 0, array.length);
    }
}
