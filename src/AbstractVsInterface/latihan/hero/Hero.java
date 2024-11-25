package AbstractVsInterface.latihan.hero;

public class Hero {
    private String name;
    private double age;

    public Hero(String name, double age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public double getAge(){
        return this.age;
    }


    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }





}
