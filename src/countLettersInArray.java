public class countLettersInArray {

    public static char [] createArray(){
        char [] chars = new char[200];

        for (int i = 0; i < chars.length; i++){
            chars [i] = RandomCharacter.getRandomLowerCaseLetter();
        }

        return chars;
    }

    public static void displayArray(char [] chars){

        for (int i = 0; i < chars.length; i++){
            if ((i + 1) % 20 ==0){
                System.out.println(chars[i]);
            }
            else
                System.out.print(chars[i] + " ");
        }
    }

    public static int[] countLetters(char [] chars){

        int [] counts = new int[26];

        for (int i = 0; i < chars.length; i++){

            counts[chars[i]-'a']++;
        }
        return counts;
    }

    public static void displayCount(int [] counts){

        for (int i = 0; i < counts.length; i++){
            if ((i + 1) % 10 == 0 ){
                System.out.println(counts[i]+ " " +(char)(i + 'a'));
            }
            else
                System.out.print(counts[i] + " " + (char)(i + 'a')+ " ");
        }
    }

    public static void main(String[] args) {
        char [] characters = createArray();

        System.out.println("The lowercase letters are: ");

        displayArray(characters);

        int [] counts = countLetters(characters);

        System.out.println();

        System.out.println("The occurrences of each letter are: ");

        displayCount(counts);

    }
}
