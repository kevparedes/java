public class testPassArray {
    public static void swap(int num1 , int num2){

        int temp = num1;

        num1 = num2;

        num2 = temp;

    }

    public static void firstTwoInArray(int [] array){

        int temp  = array [0];

        array [0] = array [1];

        array [1] = temp;

    }
    public static void main(String[] args) {
        int [] list = {1 , 2};

        System.out.println("Before invoking swap");

        System.out.println("Array is: " + list[0] + " , " + list[1]);

        swap(list[0] , list[1]);

        System.out.println("After invoking swap");

        System.out.println("Array is: " + list[0] + " , " + list[1]);

        System.out.println("Before invoking firstTwoInArray");

        System.out.println("Array is: " + list[0] + " , " + list[1]);

        firstTwoInArray(list);

        System.out.println("After invoking firstTwoInArray");

        System.out.println("Array is: " + list[0] + " , " + list[1]);


    }
}
