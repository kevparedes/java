//JAVA program that shows Hierarchical Inheritance
class a{
    public void printY(){
        System.out.println("Y");
    }
}
class b extends a{
    public void printO(){
        System.out.println("O");
    }
}

class c extends b{
    //
}
//diver class
public class hierarchicalInheritanceExample {
    public static void main(String[] args) {
        c c1 = new c();
        c1.printY();
        b b1 = new b();
        b1.printO();
    }
}
/*
Output:
Y
O
*/
