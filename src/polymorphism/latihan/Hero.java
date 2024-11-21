package polymorphism.latihan;

public class Hero {
    String name;

    Hero(String name){
        this.name = name;
    }

    void display(){
        System.out.println("name \t:\t" + this.name);
    }

    void attack(Hero enemy){
        System.out.println(this.name + " menyerang " + enemy.name);
    }



}
