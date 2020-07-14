//JAVA program that shows the concept of inheritance
//Base class
class bicycle{
    //The class has two fields
    public int gear;
    public int speed;
    //The class has a constructor
    public bicycle (int gear, int speed){
        this.gear = gear;
        this.speed= speed;
    }
    //The class has 3 methods
    public void applyBreak(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
    //Method to print the info of the class
    public String toString(){
        return ("No of the gears are " + gear + "\n"
                + "speed of bicycle is " + speed );
    }
}
//derived class
class mountainBike extends bicycle{
    //The subclass adds one more field
    public int seatHeight;
    //The subclass constructor
    public mountainBike(int gear, int speed, int startHeight){
        //invoking  base class constructor
        super(gear,speed);
        seatHeight = startHeight;
    }
    //the subclass adds one more field
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    //Override toString() method
    //to print info
    @Override
    public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}
//derived class
public class bicycleInheretanceExample {
    public static void main(String[] args) {
        mountainBike mb = new mountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
/*
Output:
No of the gears are 3
speed of bicycle is 100
seat height is 25
 */