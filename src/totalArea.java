public class totalArea {

    public static circleWithPrivateDataFields[]createCircle() {
        circleWithPrivateDataFields[] circleArray = new circleWithPrivateDataFields[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new circleWithPrivateDataFields(Math.random() * 100);
        }

        return circleArray;
    }

        public static void printCircleArray(circleWithPrivateDataFields[]circleArray){
            System.out.printf("%-30s%-15s\n", "Radious", "Area");

            for (int i = 0; i < circleArray.length; i++) {
                System.out.printf("%-30f%-15f\n", circleArray[i].getRadious(), circleArray[i].getArea());
            }

            System.out.println("---------------------------------------------");

            System.out.printf("%-30s%-15f\n", "The total area of circles is  ",sum(circleArray));
    }

    public static double sum(circleWithPrivateDataFields[]circleArray){
        double sum =0;

        for (int i = 0; i < circleArray.length ; i++) {

            sum += circleArray[i].getArea();
        }

        return sum;
    }

    public static void main(String[] args) {

        //Declare the circle Array
        circleWithPrivateDataFields [] circleArray;

        circleArray = createCircle();

        printCircleArray(circleArray);

    }
}
