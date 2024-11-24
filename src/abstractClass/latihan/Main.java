package abstractClass.latihan;

import abstractClass.com.Hero;
import abstractClass.com.HeroIntl;

public class Main {
    public static void main(String[] args) {
        // membuat object dari class non abstract
        HeroIntl heroIntl = new HeroIntl("adul");
        heroIntl.display();

        // membuat object dari class abstract
//        Hero hero = new Hero("acer");
//        hero.display();

    }
}
