public class testCircleWithPrivateDataFields {

    public static void main(String[] args) {
        circleWithPrivateDataFields myCircle = new circleWithPrivateDataFields(5.0);

        System.out.println("The are of the circle of radious " + myCircle.getRadious() + " is " + myCircle.getArea());

        myCircle.setRadious(myCircle.getRadious()*1.1);

        System.out.println("The are of the circle of radious " + myCircle.getRadious() + " is " + myCircle.getArea());

        myCircle.setRadious(myCircle.getRadious()*1.5);

        System.out.println("The are of the circle of radious " + myCircle.getRadious() + " is " + myCircle.getArea());

        System.out.println("The number of objects created is: " + circleWithPrivateDataFields.getNumberOfObjects());
    }
}
