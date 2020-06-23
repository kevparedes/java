import java.util.Scanner;

public class multidimensionalArrays {
    public static void main(String[] args) {
        double [][] distance = {{20, 30, 40, 50 , 60}, {10, 90, 80, 70}};

        for (int i = 0; i < distance.length; i++){
            for (int j = 0; j < distance[i].length; j++){
                System.out.print("This are the distances " + distance[i][j] +"\n");
            }
        }

        int [][] mat = new int [5][5];

        for (int row = 0; row < mat.length;row++){
            for (int col = 0; col < mat[row].length;col++){
                mat [row][col] = (int)(Math.random()*100);
                System.out.println("this is the matrix " + mat[row][col]);
            }
        }

        Scanner in = new Scanner(System.in);

        int [][] matrix = new int[10][10];

        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns");

        for (int i = 0; i <matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = in.nextInt();
                System.out.println("this was entered " + matrix[i][j]);
            }
        }
    }
}
