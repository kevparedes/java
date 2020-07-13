abstract class Animal2{
    abstract void makesSound();
}

class dog extends Animal2{
    void makesSound(){
        System.out.println("woof woof!");
    }
}

public class abstractAnimal{

    public static void main(String[] args) {

        dog AC = new dog();

        AC.makesSound();
    }
}