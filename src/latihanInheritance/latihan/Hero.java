package latihanInheritance.latihan;

public class Hero {
    // attr
    String name;
    double attackPower, health;

    // constructor
    Hero(String name, double attackPower, double health){
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }


    // method attack
    void attack(Hero enemy){
        System.out.println("\n" + this.name + " attack " + enemy.name);
        enemy.takeDemage(this.attackPower);
    }

    void takeDemage(double demage){
        System.out.println(this.name + " receive demage " + demage);
        this.health = this.health - demage;
    }


    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Helath : " + this.health);
        System.out.println("attack power : " + this.attackPower);
    }
}