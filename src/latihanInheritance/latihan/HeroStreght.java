package latihanInheritance.latihan;

public class HeroStreght extends Hero {
    String type = "streght";

    HeroStreght(String nameInput, double attackInput, double healthInput){
        super(nameInput, attackInput, healthInput);
    }

    @Override
    void display() {
        System.out.println("=====================================================");
        super.display();
        System.out.println("Type = " + this.type);
    }


    @Override
    void takeDemage(double demage) {
        System.out.println(this.name + " receive half demage " + demage + " -> " + 0.5*demage);
        this.health = this.health - 0.5*demage;
    }
}
