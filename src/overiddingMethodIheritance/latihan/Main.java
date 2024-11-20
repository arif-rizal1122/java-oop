package overiddingMethodIheritance.latihan;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.name = "amel";
        hero.display();

        HeroStreght heroStreght = new HeroStreght();
        heroStreght.name = "luffy";
        heroStreght.display();

        HeroStreght heroStreght1 = new HeroStreght();
        heroStreght1.name = "mountain";
        heroStreght1.defencePower = 0.32;
        heroStreght1.display();
        System.out.println("==================================");
        heroStreght1.display();

    }
}
