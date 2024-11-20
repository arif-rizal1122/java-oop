package overloadingConstructorDnMethod.latihan;






public class Main {
    public static void main(String[] args) {

        // overloading pada constructor
        Player player = new Player("udin");
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("agus");


        player1.show();
        player2.show();
        player3.show();
        player4.show();
        player.show();


        // overloading pada method
        int a = Matematika.tambah(3, 5);
        System.out.println(a);
        double b = Matematika.tambah(1, 0.98);
        System.out.println(b);
    }
}
