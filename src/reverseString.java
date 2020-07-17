public class reverseString {

    public static void main(String[] args) {

        String s = "you are here";

        String [] arr = s.split(" ");

        for (int i = arr.length - 1; i >=0 ; i--) {
            System.out.print(arr[i]);
            if (i!=0)
                System.out.print(' ');
        }
    }
}
