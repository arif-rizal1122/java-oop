package protectedKeyword.latihan.com;

public abstract class Hero {
    public String name;
    private int level;

    public Hero(String name){
        this.name = name;
        this.level = 1;
    }

    // harus diimplementasikan juga di sub class nya juga
    public abstract void levelUp();

    // setter
    public void setLevel(int deltaLevel){
        this.level = deltaLevel;
    }

    public void display(){
        System.out.println("my name is " + this.name);
        System.out.println("level " + this.level);
    }


}
