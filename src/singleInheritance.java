//JAVA program that shows SINGLE INHERITANCE
class one{
    public  void printG(){
        System.out.println("G");
    }
}
class two extends one{
    public void printO(){
        System.out.println("O");
    }

    public void printL(){
        System.out.println("L");
    }
}
public class singleInheritance {
    public static void main(String[] args) {
        two f = new two();

        f.printG();
        f.printO();
        f.printO();
        f.printL();
    }
}
/*
Output:
G
O
O
L
 */

