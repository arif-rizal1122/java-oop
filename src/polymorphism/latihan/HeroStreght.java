package polymorphism.latihan;

public class HeroStreght extends Hero{
    String type = "hero strenght";

    HeroStreght(String name){
        super(name);
    }

    @Override
    void display() {
        super.display();
        System.out.println("type \t:\t" + this.type);
        System.out.println("=============================");
    }
}
