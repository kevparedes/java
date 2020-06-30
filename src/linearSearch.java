public class linearSearch {

    public static int linearSearch(int [] list, int key){
        for (int i = 0; i < list.length; i++){
            if (key == list[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] list = { 0 ,2 ,4 ,6 ,3 ,1};

        for(int i = 0; i < list.length; i++){
            list[i]=i;
        }

        int k = linearSearch(list, 2);

        System.out.println("This is the result "+ k);

    }
}
