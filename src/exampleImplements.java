interface Animal{
    public void animalSound();
    public void sleep();
}


class pig implements Animal{

    public void animalSound(){
        System.out.println("Pig says: oink oink");
    }

    public void sleep(){
        System.out.println("Zzzz");
    }
}


public class exampleImplements {

    public static void main(String[] args) {

        pig myPig = new pig();
        myPig.animalSound();
        myPig.sleep();
    }

}
