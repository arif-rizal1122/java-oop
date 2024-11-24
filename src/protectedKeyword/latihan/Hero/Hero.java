package protectedKeyword.latihan.Hero;

public abstract class Hero {
     protected String name; // ini hanya bisa diakses oleh sub class nya saja
     private  int level;  // ini tidak bisa langsung diakses
    // public String name; // sanga bisa diakses

    public Hero(String name){
        this.name = name;
        this.level = 3;
    }

    public String getLevel() {
        String str =  "name " + this.name + "-" + this.level;
        return str;
    }
    public void setName(String name){
        this.name = name;
    }



    public abstract void display();


}
