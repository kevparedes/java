//Abstract class declaration
abstract class shapesAbstract{
    //abstract construct
    shapesAbstract(){
        System.out.println("shapes classes construct");
    }
    //abstract method
    abstract void circle();
}
//Concrete class that extends the abstract class
class firstShape extends shapesAbstract{
    //concrete construct
    firstShape(){
        System.out.println("first shape construct");
    }
    //implements the abstract method initiated in the abstract class
    void circle(){
        System.out.println("shape of circle");
    }
}

public class abstractShape {
    public static void main(String[] args) {
        //create new instance of concrete class
        firstShape s = new firstShape();
        //calls the abstract method circle initiated in the abstract class
        s.circle();
    }
}
/*
Output:
shapes classes construct
first shape construct
shape of circle
 */