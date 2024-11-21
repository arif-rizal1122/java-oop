package subsclassConstructor.latihan;

public class Hero{
    String name;
    double defencePower;

    Hero(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    Hero(String name){
        this.name = name;
    }
    void display(){
        System.out.println("name = " + this.name);
        System.out.println("================================================================");
        System.out.println("defence power = " + this.defencePower);
    }
    void display1(){
        System.out.println("name = " + this.name);
    }
}

