package abstractMethod.latihan.latihan;

import abstractMethod.latihan.com.HeroAgility;
import abstractMethod.latihan.com.HeroIntl;

public class Main {
    public static void main(String[] args) {
        HeroIntl hero1 = new HeroIntl("asep");
        hero1.levelUp();
        hero1.display();
        System.out.println("=== ===");

        HeroAgility hero2 = new HeroAgility("anwar");
        hero2.levelUp();
        hero2.display();
    }
}
