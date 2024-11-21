package latihanInheritance.latihan;

public class HeroIntl extends Hero {
    String type = "inteligence";

    HeroIntl(String nameInput, double attackPower, double healthInput){
        super(nameInput, attackPower, healthInput);
    }

    @Override
    void display() {
        System.out.println("=========================================");
        super.display();
        System.out.println("type : " + this.type);
    }
}
