package constructor.latihan;


import java.util.Scanner;

// class tanpa constructor
class Polos {
    String dataString;
    int dataInteger;
}

/**
 * - secara konsep constructor adalah cara kita mengkomposisikan sebuah object
 * - constructor adalah sesuatu fungsi/method yg pertama kali dipanggil ketika object dibuat
 *
 */


class Mhs {
    String nama;
    String umur;
    int nim;

    // constructure tanpa parameter
    Mhs(){
        System.out.println("ini adalah constructor");
    }

    // constructure dengan parameter
    Mhs(String inputNama){
        nama = inputNama;
        System.out.println("dia bernama : " + inputNama);
    }

}


public class Main {
    public static void main(String[] args) {

        Polos objPolos = new Polos();
        objPolos.dataString = "poslos aha";
        objPolos.dataInteger = 324;

        System.out.println("===================================================");
        Scanner masuk = new Scanner(System.in);
        System.out.print("masukan parameter = ");
        String inputName = masuk.nextLine();

        Mhs objMhs = new Mhs();
        new Mhs(inputName);




    }
}
