package overloadingConstructorDnMethod.latihan;



public class Player {
     private String name;
     private static int jumlah;

     // opsi 1
     Player(String name){
         Player.jumlah++;
         this.name = name;
     }

     // opsi 2
    Player(){
        this.name = "asep " + Player.jumlah++;
    }
    void show(){
        System.out.println("name player " + this.name);
    }

}
