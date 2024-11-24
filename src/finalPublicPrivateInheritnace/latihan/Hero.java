package finalPublicPrivateInheritnace.latihan;

public class Hero {
    public String name;
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    // getter
    double getHealth(){
        return this.health;
    }


    // setter
    final void setHealth(double newHealth){
        this.health = newHealth;
    }
    final void setHealth(String mode){
        if (mode.equals("reset")){
            this.health = 4000;
        }
    }


    void display(){
        System.out.println("ini name " + this.name + " mempunyai helath " + this.health);
    }


}
