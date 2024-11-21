package polymorphism.latihan;

public class HeroIntl extends Hero{
    String type = "hero inteligence";

    HeroIntl(String name){
        super(name);
    }

    @Override
    void display() {
        super.display();
        System.out.println("type \t:\t" + this.type);
    }
}
