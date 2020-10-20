package interviewAssesments;

public class composePrime {

    public static void main(String[] args) {

        int size = 6;

        int [] lst = {10, 11, 12, 41, 21, 2};

        for (int i = 0; i < size ; i++) {

            boolean isPrime = true;

            if (lst[i] == 1){
                isPrime = false;
            }
            else{
                for (int j = 2; j < lst[i] ; j++) {
                    if (lst[i] % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                System.out.print("Prime" + " ");
            }
            else{
                System.out.print("Composite" + " ");
            }
        }
    }
}
