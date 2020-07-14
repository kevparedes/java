//JAVA program that shows the Multilevel Inheritance
class first{
    public void printH(){
        System.out.println("H");
    }
}
class second extends first{
    public void printE(){
        System.out.println("E");
    }
}
class third extends second{
    public void printS(){
        System.out.println("S");
    }
}
//Drived class
public class multilevelInheritance {
    public static void main(String[] args) {
        third z = new third();
        z.printS();
        z.printH();
        z.printE();
    }
}
/*
Output:
S
H
E
*/
