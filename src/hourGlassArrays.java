public class hourGlassArrays {

    static int hourGlassSum(int [][] arr){

        int max_sum= Integer.MIN_VALUE;

        //size number of columns
        for (int i = 0; i < arr.length-2 ; i++) {
            //size number of rows
            for (int j = 0; j < arr[0].length-2 ; j++) {

                int sum = (arr[i][j]+arr[i][j+1]+arr[i][j+2])
                        +(arr[i+1][j+2])+(arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);

                max_sum = Math.max(max_sum, sum);
                
            }
            
        }

        return max_sum;
    }

    public static void main(String[] args) {

        int [] [] arr = {{1, 1, 1, 0, 1, 1},
                        {0, 1, 0, 1, 0, 1},
                        {1, 1, 1, 1, 0, 0},
                        {0, 1, 0, 0, 1, 0},
                        {1, 1, 0, 1, 0, 1},
                        {0, 0, 1, 0, 1, 0}};

        System.out.println("The max number "+hourGlassSum(arr));
    }

}
