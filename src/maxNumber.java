public class maxNumber {
    public static int max (int val1, int val2){

        int result;

        if (val1 < val2){
            result = val1;
        }
        else {
            result = val2;
        }


        return result;
    }

    public static void main(String[] args) {

        int number1 = 5;

        int number2 = 10;

        int outcome = max(number1, number2);

        System.out.println("This is the max number: " + outcome );

    }
}
