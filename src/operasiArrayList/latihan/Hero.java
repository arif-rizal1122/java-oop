package operasiArrayList.latihan;

public class Hero {

    private String name;
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    void setName(String newMame){
        this.name = newMame;
    }

    void display(){
        System.out.println(this.name + " memiliki " + this.health);
    }

    public String toString(){
        return  "Hero " + this.name;
    }

}
