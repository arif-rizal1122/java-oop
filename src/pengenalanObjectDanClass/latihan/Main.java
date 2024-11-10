package pengenalanObjectDanClass.latihan;


// ini class
class Mahasiswa {
   String nama;
   String jurusan;
   double IPK;
   int umur;
   String NIM;
}

public class Main {
     public static void main(String[] args) {
          // instansiasi / membuat object

         Mahasiswa mahasiswa1 = new Mahasiswa();
         mahasiswa1.nama = "arif";
         mahasiswa1.jurusan = "IPA";
         mahasiswa1.IPK = 5.0;
         mahasiswa1.umur = 90;
         mahasiswa1.NIM = "5654685";

         System.out.println(mahasiswa1.nama);
         System.out.println(mahasiswa1.umur);
         System.out.println(mahasiswa1.jurusan);
         System.out.println(mahasiswa1.NIM);
         System.out.println(mahasiswa1.IPK);

     }

}
