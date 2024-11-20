package staticMethod.latihan;

import java.util.ArrayList;

class Player{
    private static String name;
    static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<>();

    Player(String name){
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

     static ArrayList<String> getNameList(){
        return Player.nameList;
     }
    void show(){
        System.out.println("player name = " + this.name);
        System.out.println("jumlah player nya " + Player.numberOfPlayer);
        System.out.println("tampilan list = " + Player.getNameList());
    }
}

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("asep");
        Player player2 = new Player("agus");
        Player player3 = new Player("amel");
        player1.show();
        System.out.println("names " + Player.getNameList());
    }

}
