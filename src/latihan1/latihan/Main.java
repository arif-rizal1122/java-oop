package latihan1.latihan;

import java.util.Scanner;

// player
class Player {
    String name;
    double health;
    int level;

    Weapon weapon;
    Armor armor;

    Player(String name, double health, int level){
        this.name = name;
        this.health = health;
        this.level = level;
    }

    // memanggil semua data beserta data-data turunan nya
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    void equipArmor(Armor armor){
        this.armor = armor;
    }

    // ini menampilkan sehingga sekali panggil disini
    void display(){
        System.out.println("name : " + this.name);
        System.out.println("health : " + this.health + " hp");
        System.out.println("level : " + this.level);

        this.weapon.display();
        this.armor.display();
    }
}


// senjata
class Weapon{
    double attackPower;
    String _description;

    Weapon(String _description, double attackPower){
        this.attackPower = attackPower;
        this._description = _description;
    }

    void display(){
        System.out.println("Weapon : " + this._description + " , attack power: " + this.attackPower);
    }

}


// armor
class Armor{
    double defencePower;
    String description;

    Armor(String description, double defensePower){
        this.defencePower = defensePower;
        this.description = description;
    }

    void display(){
        System.out.println("armor : " + this.description + " , defence power " + this.defencePower);
    }
}




public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name, description, _description;
        int level;
        double health, attackPower, defencePower;

        System.out.print("masukan nama player : ");
        name = input.nextLine();
        System.out.print("masukan level player : ");
        level = input.nextInt();
        System.out.print("masukan health player : ");
        health = input.nextDouble();

        System.out.print("masukan nilai attack power : ");
        attackPower = input.nextDouble();
        input.nextLine();

        System.out.print("masukan nilai defence Power : ");
        defencePower = input.nextDouble();
        input.nextLine();

        System.out.println("descripsi weapon : ");
        _description = input.nextLine();

        System.out.println("descripsi defence armor : ");
        description = input.nextLine();


    // init obj player
    Player player1 = new Player(name, health, level);

    // init obj weapon
    Weapon sword = new Weapon(_description, attackPower);

    // init obj armor
    Armor ironSwear = new Armor(description, defencePower);

    // equip sejata dan armor
    player1.equipWeapon(sword);
    player1.equipArmor(ironSwear);
    player1.display();

    }

}
