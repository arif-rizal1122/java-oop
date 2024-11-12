package refernceOfObject.latihan;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    void display(){
        System.out.println("Judul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}







public class Main {
    public static void main(String[] args) {
        Buku dataBuku1 = new Buku("man of the match", "miyami tanaka");
        dataBuku1.display();
        System.out.println("\n====================================================");
        String address = Integer.toHexString(System.identityHashCode(dataBuku1));
        System.out.println("address dalam fungsi = " + address); // 6acbcfc0

        // assigment object
        System.out.println("\n====================================================");
        Buku dataBuku2 = dataBuku1;
        dataBuku2.display();
        String address2 = Integer.toHexString(System.identityHashCode(dataBuku2));
        System.out.println("address dalam fungsi = " + address2); // 6acbcfc0

        System.out.println("\n====================================================");
        // karena dataBuku1 dan dataBuku2 berada di reference object yg sama maka dia akan mengeksekusi dari deklarasi dari variabel yg sama
        dataBuku1.judul = "killing sprint";
        dataBuku1.display();
        System.out.println("\n====================================================");
        dataBuku2.display();

        // kita akan memasukan object kedalam fungsi
        fungsi(dataBuku2);
    }

    public static void fungsi(Buku dataBuku) {
        String address = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi = " + address);

        System.out.println("\n====================================================");

        dataBuku.penulis = "asep";
        dataBuku.display();
        Buku databuku2 = dataBuku;
        databuku2.penulis = "umr";
        databuku2.display();

    }

}
