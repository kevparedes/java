//JAVA program that test Encapsulation data
public class testEncapsulation {
    public static void main(String[] args) {
        dataEncapsulated demo = new dataEncapsulated();

        demo.setName("Jhon");
        demo.setAge(26);
        demo.setGender("Male");

        System.out.println("Encapsulated data name is " + demo.getName());
        System.out.println("Encapsulated data age is " + demo.getAge());
        System.out.println("Encapsulated data gender is " + demo.getGender());
    }
}
/*
Output:
Encapsulated data name is Jhon
Encapsulated data age is 26
Encapsulated data gender is Male
*/