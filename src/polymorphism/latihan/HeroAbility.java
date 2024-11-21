package polymorphism.latihan;

public class HeroAbility extends Hero{

    String type = "hero ability";

    HeroAbility(String name){
        super(name);
        System.out.println("type \t:\t" + this.type);
    }

    void showOff(){
        System.out.println("saya hero ability!!!!");
    }

    @Override
    void display() {
        super.display();
        System.out.println("type \t:\t" + this.type);
        System.out.println("=============================");
    }

}
