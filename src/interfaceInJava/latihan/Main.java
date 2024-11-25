package interfaceInJava.latihan;

import interfaceInJava.latihan.hero.Hero;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("asep", 69);
        Hero hero2 = new Hero("otong", 60);
        hero1.attack(hero2);
        hero2.attack(hero1);
        hero1.display();

    }
}
