public class reverseWordsString {

    public static void main(String[] args) {
        String s = "eat to live";

        byte [] arr = s.getBytes();
        byte [] result = new byte[arr.length];

        for (int i = 0; i <result.length ; i++) {
            result[i] = arr[arr.length - i - 1];
        }

        System.out.println(new String(result));

    }

}
