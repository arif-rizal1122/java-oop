package staticAtauClassAttr.latihan;




class Display{
    private String name;
    public static String type = "Display";

    Display(String name) {
        this.name = name;
    }

    void show(){
        System.out.println("ini display name = "  + this.name);
    }
    void setType(String typeInput){
        // type = typeInput; // alternatif 1
        // this.type = typeInput; // alternatif 2
        Display.type = typeInput; // alternatif 3 paling recommended
    }
}



public class Main {
    public static void main(String[] args) {

        Display display = new Display("asep");
        display.show();

        // tampilkan static variabel

        display.setType("minuman");

        System.out.println(display.type);
        System.out.println(Display.type);

    }
}
