package interfaceInJava.latihan.hero;

public class Hero implements IAttack {
    private String name;
    private double health;

    public Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    public void attack(Hero enemy){
        System.out.println(this.name + " attack enemy " + enemy.name);
    }

    public void display(){
        System.out.println("name : " + this.name);
        System.out.println("health : " + this.health);
    }

}
