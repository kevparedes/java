//JAVA program for method overloading
class multiplyFun{
    //Method with 2 parameters
    static  int multiply(int a, int b){
        int result = a * b;
        return result;
    }
    //Method with 3 parameters
    static int multiply(int a, int b, int c){
        int result = a * b * c;
        return result;
    }
}

public class methodOverloadingExample {

    public static void main(String[] args) {

        System.out.println(multiplyFun.multiply(2, 4));
        System.out.println(multiplyFun.multiply(2, 3, 4));
    }
}
/*
Output:
8
24
 */