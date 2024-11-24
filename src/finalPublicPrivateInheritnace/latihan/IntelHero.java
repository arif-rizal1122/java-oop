package finalPublicPrivateInheritnace.latihan;

public class IntelHero extends Hero{

    IntelHero(String name, double health){
       super(name, health);
    }

    // mencoba mengoveride di subsclass nya , tidak bisa dilakukan
//    void setHealth(double newHealth){
//        System.out.println("subsclass mencoba memasukan health " + newHealth);
//    }
//    void setHealth(String newHealth){
//        System.out.println("subsclass mencoba memasukan health " + newHealth);
//    }

    // visibility harus sama dengan super class
    @Override
    public void display() {
        System.out.println(this.name + " mempunyai banyak " + this.getHealth());
    }
}
