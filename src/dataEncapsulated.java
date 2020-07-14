//JAVA program that shows encapsulation of data
public class dataEncapsulated {

    private String name;
    private int age;
    private String gender;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public void setName( String newName){
        name = newName;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setGender(String newGender){
        gender = newGender;
    }
}
