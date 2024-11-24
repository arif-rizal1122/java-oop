package protectedKeyword.latihan.tutorial;


import protectedKeyword.latihan.Hero.HeroStreght;

public class Main {
    public static void main(String[] args) {

        HeroStreght hero1 = new HeroStreght("adel");
        hero1.display();
        System.out.println("=======================");
        hero1.setName("agus");
        hero1.display();

    }
}
