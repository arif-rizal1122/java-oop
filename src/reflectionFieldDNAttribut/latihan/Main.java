package reflectionFieldDNAttribut.latihan;

import reflectionFieldDNAttribut.latihan.Hero.HeroAgility;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        HeroAgility heroAgility = new HeroAgility("asus", 89);
        heroAgility.setNickName("aninomus");
        heroAgility.displayAll();

        // access modifier
        heroAgility.nickName = "modifier"; // ini bisa karena public
        heroAgility.displayAll();
        // heroAgility.heroType = "denied"; karena private

        System.out.println("=== reflection ===");
        // reflection
        Class<?> ClassHeroAgility = heroAgility.getClass();
        Class<?> ParentClassHeroAgility = heroAgility.getClass().getSuperclass();
        System.out.println("\n class : " + ClassHeroAgility);
        System.out.println("\n class : " + ClassHeroAgility.getName());
        System.out.println("\n Parent : " + ParentClassHeroAgility);

        // cek attr dari obejct heroAgility
        System.out.println("===  attribute dari object hero heroAgility ===");
        Field[] heroAgilityField = ClassHeroAgility.getFields();
        System.out.println("jumlah attr : " + heroAgilityField.length); // bisa mengambil yg visible
        System.out.println("attr : " + heroAgilityField[0].getName()); // nickName

        // cek attr semua object heroAgility/ cara ini membuat field2 nya ketahuan
        System.out.println("===  attribute semua dari object hero heroAgility ===");
        Field[] heroAgilityAll = ClassHeroAgility.getDeclaredFields();
        System.out.println("jumlah attr : " + heroAgilityAll.length);
        System.out.println("attribut : ");
        for (Field field:heroAgilityAll){
            System.out.println(field.getName());
        }
        System.out.println("===  attribute semua dari object hero parent heroAgility ===");
        Field[] ParentheroAgilityAll = ParentClassHeroAgility.getDeclaredFields();
        System.out.println("jumlah attr : " + heroAgilityAll.length);
        System.out.println("attribut : ");
        for (Field field:ParentheroAgilityAll){
            System.out.println(field.getName()); // name, healt dari superclass nya
        }

        System.out.println("===  mencoba ubah nilainya dengan reflection ===");
        heroAgility.displayAll();
        System.out.println("menjadi : ");
        // merubah public bisa
        heroAgilityAll[0].set(heroAgility,"angel"); // yg awal nya asus menjadi angel
        // mencoba merubah private
        heroAgilityAll[1].setAccessible(true);
        heroAgilityAll[1].set(heroAgility, "asep_anwar");
        heroAgility.displayAll(); // yg awal nya anonimus menjadi asep

        // ubah semua
        System.out.println("===  mencoba ubah semua ===");
        heroAgilityAll[0].setAccessible(true);
        heroAgilityAll[0].set(heroAgility, "adel_ubah_all");
        heroAgilityAll[1].setAccessible(true);
        heroAgilityAll[1].set(heroAgility, "amer_is_my");
        heroAgility.displayAll();

    }
}
