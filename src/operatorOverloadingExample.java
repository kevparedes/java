//JAVA program for Operator Overloading
class operatorOver{
    //Operator with 2 integers
    void operator (int a, int b){
        System.out.println(a+b);
    }
    //Operator with 2 Strings
    void operator (String a, String b){
        System.out.println(a+b);
    }
}
public class operatorOverloadingExample {
    public static void main(String[] args) {
        operatorOver OP = new operatorOver();
        OP.operator(2, 2);
        OP.operator("Jhon", "Snow");
    }
}
/*
Output:
4
JhonSnow
 */
