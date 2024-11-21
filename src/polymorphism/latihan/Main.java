package polymorphism.latihan;





public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("asep");
        hero1.display();
        System.out.println("=============================");
        HeroStreght hero2 = new HeroStreght("adul");
        hero2.display();

        // polimorphism ini berlaku dari class utama ke sub class nya
        Hero hero3 = new HeroAbility("miya");
        hero3.display();
          // ini tidak bisa
//        HeroIntl hero4 = new Hero("agus");
//        hero4.display();

        HeroAbility hero4 = new HeroAbility("SEDIH");
        hero4.showOff();
        hero4.display();

        // array list
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4; // casting

        System.out.println("========= SOUT ARRAY =========");
        kumpulanHero[0].display();
        System.out.println("==============================");
        kumpulanHero[1].display();
        kumpulanHero[2].display();
        kumpulanHero[3].display();

        // method calls
//        kumpulanHero[3].showOff();

        // plikasi
        hero1.attack(hero2);


    }
}
