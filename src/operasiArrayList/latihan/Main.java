package operasiArrayList.latihan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("a", 30);
        Hero hero2 = new Hero("b", 40);
        AgilityHero agilityHero = new AgilityHero("c", 70);
        IntelHero intelHero = new IntelHero("d", 73);

        ArrayList<Hero> listHero = new ArrayList<Hero>();
        // operasi satu add
        System.out.println("======= Add Data Array ======");
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(agilityHero);
        listHero.add(intelHero);
        for (Hero list:listHero){
            list.display();
        }
        /**
         * a  memiliki 30.0
         * b  memiliki 40.0
         * c  memiliki 70.0
         * d  memiliki 73.0
         * */
        System.out.println("===== set member data array list. mengubah member dengan set =====");
        listHero.set(0,intelHero);
        for (Hero list:listHero){
            list.display();
        }
        /**
         * d  memiliki 73.0
         * b  memiliki 40.0
         * c  memiliki 70.0
         * d  memiliki 73.0
         * */
        System.out.println("===== menghapus data array list =====");
        listHero.remove(0);
        for (Hero list:listHero){
            list.display();
        }
        /**
         * b  memiliki 40.0
         * c  memiliki 70.0
         * d  memiliki 73.0
         * */
        System.out.println("===== mengakses member =====");
        Hero ambil = listHero.get(2);
        System.out.println(ambil);
        /**
         * c  memiliki 70.0
         * */
        System.out.println("===== method2 pada array list =====");
        System.out.println("size " + listHero.size());
        System.out.println("is_empty " + listHero.isEmpty());
        System.out.println("contain " + listHero.contains(hero2));
        System.out.println("index_of " + listHero.indexOf(agilityHero));

    }
}
