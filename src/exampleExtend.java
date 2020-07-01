
class vehicle{
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut tuut");
    }
}

class car extends vehicle{
    private String modelName = "Mustang";

    public static void main(String[] args) {

        car myCar = new car();

        myCar.honk();

        System.out.println(myCar.brand+" "+myCar.modelName);
    }
}

