package latihanInterface.latihan;

import latihanInterface.latihan.hero.AttackMelee;
import latihanInterface.latihan.hero.AttackRange;
import latihanInterface.latihan.hero.HeroAgility;

public class Main {
    public static void main(String[] args) {

        HeroAgility hero1 = new HeroAgility("asep", 90);
        HeroAgility hero2 = new HeroAgility("otong", 87);

        hero1.setAttackSkill(new AttackMelee(100));
        hero2.setAttackSkill(new AttackRange(50));

        hero1.display();
        System.out.println("=============================");
        hero2.display();
        System.out.println("========== war =========");
        hero1.attack(hero2);
        hero2.attack(hero1);


    }
}
