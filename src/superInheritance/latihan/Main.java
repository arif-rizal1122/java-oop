package superInheritance.latihan;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Hero hero1 = new Hero();
        HeroStreght heroStreght = new HeroStreght();

        hero.display();
        heroStreght.displaySuper();
        heroStreght.display();
    }
}
