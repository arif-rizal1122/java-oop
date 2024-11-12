package getterAndSetter.latihan;

class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 50;
    }

    // getter
    public int getIntPrivate(){
         return this.intPrivate;
    }

    // setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
    // show all
    void displya(){
        System.out.println("integer public " + this.intPublic);
        System.out.println("integer private " + this.intPrivate);
        System.out.println("double private " + this.doublePrivate);
    }
}

class Lingkaran{
    private double diameter;
    Lingkaran(double diameter){
        this.diameter = diameter;
    }
    // setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }
    // getter
    public double getJari2(){
        return this.diameter/2;
    }
    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }
    void display(){
        System.out.println("ambil nilai jari-jarinya = " + this.getJari2());
        System.out.println("Luas nilai nya = " + this.getLuas());
    }
}

public class Main {
    public static void main(String[] args) {

        Data objectData = new Data();

        // public read and write
        objectData.intPublic = 30; // write
        System.out.println("public nya = " + objectData.intPublic); // read

        // read only (kita bisa mengunakan GETTER) without write
         int angka = objectData.getIntPrivate();
         System.out.println("getter nya = " + angka);

        System.out.println("\n==========================================");
        //  write only (kita bisa mengunakan SETTER) without read
        objectData.setDoublePrivate(32.30);
        objectData.displya();
        System.out.println("\n==========================================");
        // gabungkan read dan dan write dengan setter dan getter
        Lingkaran objLingkaran = new Lingkaran(77);
        objLingkaran.setJari2(14); // write
        objLingkaran.display();    // read



    }


}
