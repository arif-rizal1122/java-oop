package finalPublicPrivateInheritnace.latihan;

// visibility
/**
 *
 * 1. public : jika method atau attr dalam public secara explisit, maka subsclass tidak boleh mengurangi visibility
 * 2. jika attr / method dalam private secara explisit maka subsclass pun tidak bisa mengakses
 *
 * 3. private : jika method atau attr dalam private secara explisit, maka subsclass pun tidak dapat mengakses
 *
 * 4. final : method / attr dengan final keyword akan di inheritance itu method nya sudah final dan tidak bisa diubah-ubah ayau di ovveride lagi/ditimpa
 *    tapi masih bisa di overlop
 *
 *
 *
 * */

public class Main {
    public static void main(String[] args) {

        System.out.println("test");

        Hero hero = new Hero("asep", 20);
        IntelHero intelHero = new IntelHero("adul", 60);

        hero.display();
        intelHero.display();
        System.out.println("================================================");
        hero.setHealth(40);
        intelHero.setHealth(59);
        hero.display();
        intelHero.display();
        System.out.println("================================================");
        hero.setHealth("reset");
        hero.display();
        intelHero.setHealth("reset");
        intelHero.display();


    }
}
