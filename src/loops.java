public class loops {
    public static void main(String[] args) {
        int count = 0;

        while(count < 5)
        {
            System.out.println("this is repeats");
            count ++;
            int numb = count;
            System.out.println(numb);
        }

        System.out.println("--------------");

        int num2 = 0;

        do{
            System.out.println("hello");
            num2++;
            System.out.println(num2);
        }while (num2 < 6);

        for (int i = 0; i < 3; i++){
            System.out.println("Here It comes again");
            System.out.println(i);
        }

        System.out.println("--------------");

        for (int a = 1; a < 5; a++){
            System.out.print(a + " | " );
            for(int b = 1; b < 5; b++){
                System.out.printf("%4d", a * b);
            }
            System.out.println();
        }

        System.out.println("--------------");

        int num3 = 0;
        int num4 = 0;

        while (num3 < 20){
            num3++;
            System.out.print(num3 + " This is num3 \n");
            num4 += num3;
            System.out.print(num4 + " This is num4 \n");
            if (num4 >= 100)
            {
                break;
            }

            System.out.println("number is  " + num3);
            System.out.println("sum is " + num4);
        }

    }
}
