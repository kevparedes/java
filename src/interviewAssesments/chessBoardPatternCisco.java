package interviewAssesments;

public class chessBoardPatternCisco {

    public static void main(String[] args) {

        int size = 12;
        char black = 'B';
        char white = 'W';

        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size ; j++) {
                if (i % 2 == j %2){
                    System.out.print(white);
                }
                else {
                    System.out.print(black);
                }
            }
        }
    }
}
