abstract class demo{
    abstract void display();
}


public class demoAbstractClass {

    public static void main(String[] args) {
        demo AC = new demo() {
            void display() {
                System.out.println("This is the demo abstract class");
            }
        };

        AC.display();
        System.out.println("This is inside the psvm");
    }
}
