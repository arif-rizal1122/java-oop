package objectTheSuperClass.latihan;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("amel");
        hero1.display();
        // class object adalah super class yg emang ada di java
        Object hero2 = hero1;
        String str_hero2 = hero2.toString();
        String str_hero1 = hero2.toString();
        System.out.print(str_hero2 + str_hero2);
    }
}
