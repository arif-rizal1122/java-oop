package interfaceInJava.latihan;

import AbstractVsInterface.latihan.hero.HeroAgility;
import AbstractVsInterface.latihan.hero.HeroIntl;
import interfaceInJava.latihan.hero.Hero;

public class Main {
    public static void main(String[] args) {

        HeroAgility hero1 = new HeroAgility("asep", 69);
        HeroIntl hero2 = new HeroIntl("otong", 60);

        hero1.attack(hero2);
        hero2.attack(hero1);
        System.out.println("=======================");
        hero2.spell(hero1);
        hero2.attack(hero1);

        hero1.display();

    }
}
