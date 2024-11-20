package inheritance.latihan;

// inheritance adalah hubungan is-a
/**
 *
 * superclass, parent class, base class
 *
 * */
class Hero{
    String name;

    void display(){
        System.out.println("name = " + this.name);
    }
}

/**
 *
 * subclass, inheritance
 * */
class HeroStrength extends Hero{

}

class HeroIntl extends Hero{

}

public class Main {
    public static void main(String[] args) {
       Hero hero1 = new Hero();
       hero1.name = "asep";

       HeroStrength heroStrength = new HeroStrength();
       heroStrength.name = "otong";

       HeroIntl heroIntl = new HeroIntl();
       heroIntl.name = "afgan";

       Ehem adel = new Ehem();
       adel.name = "ardian";

       adel.display();
       hero1.display();
       heroStrength.display();
       heroIntl.display();
    }
}
