public class methods {

    public static int sum(int numb1, int numb2){
        int result = numb1 + numb2;
        return result;
    }

    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = sum(i, j);
        System.out.println("This is the result of a method being called from the main "+ k);
    }
}
