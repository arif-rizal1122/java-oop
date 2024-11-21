package subsclassConstructor.latihan;


class HeroStreght extends Hero {

    HeroStreght(String name, double defencePower){
        super(name, defencePower);
    }
    HeroStreght(String name){
        super(name);
    }
}

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("asep", 0.34); // ini memakai constructor super class
        hero.display();

        HeroStreght heroStreght = new HeroStreght("adel", 0.93);
        heroStreght.display();
        System.out.println("============================================");
        HeroStreght heroStreght1 = new HeroStreght("adul");
        heroStreght1.display1();
    }
}
