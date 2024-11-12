package publicAndPrivate.latihan;




class Player{
    String name; // default, diakan bisa dibaca dan ditulis dari luas class
    public int experience; // public, diakan bisa dibaca dan ditulis dari luas class
    private int health; // private, diakan bisa dibaca dan ditulis dari dalam class saja

    Player(String name, int experience, int health) {
        this.name = name;
        this.experience = experience;
        this.health = health;
    }

    // default modifier access
    void display(){
        tambahXp(); // alternative access private nya
        System.out.println("\nName\t : " + this.name);
        System.out.println("Experience\t : " + this.experience);
        System.out.println("Health\t : " + this.health);
    }

    public void ubahNama(String namaBaru){
        this.name = namaBaru;
    }
    private void tambahXp(){
        this.experience = 8000;
    }

}



public class Main {
    public static void main(String[] args) {
          // default
          System.out.println("\n======================================================================");
          Player player1 = new Player("munchen",0,45); // yg pertama adalah nilai default nya
          player1.display();

          System.out.println("\n======================================================================");
          player1.name = "amel";
          player1.display();

          // public
          System.out.println("\n======================================================================");
          System.out.println(player1.experience);
          player1.experience = 200;
          player1.display();

          // private / tidak bisa diakses
          System.out.println("\n======================================================================");
//          player1.health = 300;
//          System.out.println(player1.health);


          // public
         player1.ubahNama("anton");
         player1.display();
         // private / tidak bisa diaccess dari luar
//         player1.tambahXp(23)




    }
}
