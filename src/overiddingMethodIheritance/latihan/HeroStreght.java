package overiddingMethodIheritance.latihan;

public class HeroStreght extends Hero{
    double defencePower;

    @Override
    void display() {
        System.out.println("hero streght = " + this.defencePower);
        System.out.println("hero name = " + this.name);
    }
}
