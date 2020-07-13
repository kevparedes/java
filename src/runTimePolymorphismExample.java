//JAVA program for Method Overriding Example
class parent{
    void print(){
        System.out.println("This is the parent class");
    }
}

class subClass1 extends parent{

    void print(){
        System.out.println("This is the subclass 1");
    }
}

class subClass2 extends parent{

    void print(){
        System.out.println("This is the subclass 2");
    }
}

public class runTimePolymorphismExample {
    public static void main(String[] args) {
        parent a;
        a = new parent();
        a.print();
        a = new subClass1();
        a.print();
        a = new subClass2();
        a.print();
    }
}

/*
Output:
This is the parent class
This is the subclass 1
This is the subclass 2
 */
