public class maxSumSubset {

    public void sumSubsets(int [] arr){

        int include = arr [0];
        int exclude = 0;
        int excludeNew;

        for (int i = 0; i <arr.length ; i++) {

            excludeNew = (include > exclude)?include:exclude;

            include = exclude + arr[i];
            exclude = excludeNew;
        }
        System.out.println((include > exclude)?include:exclude);
    }
    public static void main(String[] args) {
        int [] arr = {2, 1 ,4 ,3};

        maxSumSubset op = new maxSumSubset();

        op.sumSubsets(arr);
    }
}
