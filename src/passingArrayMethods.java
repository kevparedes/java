public class passingArrayMethods {
    public static void test(int number, int [] values){

        number = 10001;

        values [0] = 5000;
    }

    public static void main(String[] args) {

        int x = 1;

        int [] myList = new int[10];

        test(x, myList);

        System.out.println("X is: " + x);
        System.out.println("Y [0] is " + myList[0]);

    }
}
