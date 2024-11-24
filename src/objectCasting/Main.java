package objectCasting;

public class Main {
    public static void main(String[] args) {

        // casting
        double angka = 5.4;
        int angka_int = (int)  angka; // hasilnya 5

        System.out.println(angka_int);

        System.out.println("================================");
        // object dengan class heroIntel
        HeroIntl heroIntl = new HeroIntl("intelku", 30);
        heroIntl.display();
        System.out.println();
        System.out.println("=== coba up casting ===");
        Hero heroUp = (Hero) heroIntl;
        heroUp.display();
        // heroUp.castMagic() . tidak bisa karena posisi nya ada di class Hero
        System.out.println("=== coba down casting ===");
        // tidak bisa down casting dari superclass ke subsclass
         Hero heroReq = new Hero("amel", 33);
         heroReq.display();
        // HeroAgility heroDown = (HeroAgility) heroReq;
        // heroDown.display();

        // berhasil di dwon casting dengan syarat bentuk awalnya adalah sama
        HeroIntl hero2 = (HeroIntl) heroUp;
        hero2.display();
        System.out.println(hero2.type);
        hero2.castMagic();



    }
}
