public class circleWithPrivateDataFields {

    private double radious =1;

    private static  int numberOfObjects =0;


    public circleWithPrivateDataFields(){
        numberOfObjects++;
    }

    public circleWithPrivateDataFields(double newRadious){
        radious =newRadious;
        numberOfObjects++;
    }

    public double getRadious(){
        return radious;
    }

    //?: is an condition that returns either newRadious or 0
    public void setRadious(double newRadious){
        radious = (newRadious >= 0) ? newRadious : 0;
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public double getArea(){
        return radious * radious * Math.PI;
    }
}
