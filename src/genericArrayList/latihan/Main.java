package genericArrayList.latihan;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("adelss", 305);
        Hero hero1 = new Hero("adel", 30);
        AgilityHero hero2 = new AgilityHero("afif", 90);
        IntlHero hero3 = new IntlHero("desi", 865);
        System.out.println("===== ARRAY =====");

        // array sederhana
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero;
        kumpulanHero[1] = hero1;
        kumpulanHero[2] = hero2;
        kumpulanHero[3] = hero3;


        for (Hero heros:kumpulanHero) {
            heros.display();
        }


        System.out.println("===== ARRAY LIST =====");
        ArrayList<Hero> listHero = new ArrayList<Hero>();
        listHero.add(hero);
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(hero3);
        listHero.remove(3);
        // Display each Hero
        for (Hero h:listHero) {
            h.display();
        }
        System.out.println("=================");
        // reference
        hero2.setName("dudung");
        for (Hero h:listHero) {
            h.display();
        }

    }
}
