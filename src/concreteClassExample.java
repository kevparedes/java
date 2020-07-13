abstract class demoConcrete{
    abstract void display();
}

class concreteClass extends demoConcrete{
    void display(){
        System.out.println("This is inside the concrete class");
    }
}

public class concreteClassExample {
    public static void main(String[] args) {

        concreteClass AC = new concreteClass();
        AC.display();
        System.out.println("This is inside the psvm");

    }
}
