package latihanInheritance.latihan;


public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("tanjirou", 0.23, 0.89);
        hero.display();

        HeroStreght heroStreght = new HeroStreght("zenitsu", 34, 50);
        heroStreght.display();
        HeroIntl heroIntl = new HeroIntl("sasuke", 30, 70);
        heroIntl.display();

        hero.attack(heroStreght);
        System.out.println("setelah diserang");
        hero.display();
        heroStreght.display();
    }
}
