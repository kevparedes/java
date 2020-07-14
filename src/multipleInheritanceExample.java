//JAVA program that shows MULTIPLE INHERITANCE
interface uno{
    public void printG();
}
interface dos{
    public void printO();
}
interface tres extends uno, dos{
    public void printG();
}
class child implements tres{
    @Override
    public void printG(){
        System.out.println("G");
    }
    public void printO(){
        System.out.println("O");
    }
}
//Drived class
public class multipleInheritanceExample {
    public static void main(String[] args) {
        child c = new child();
        c.printG();
        c.printO();
        c.printO();
    }
}
/*
Output:
G
O
O
*/
