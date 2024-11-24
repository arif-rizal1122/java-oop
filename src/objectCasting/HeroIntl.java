package objectCasting;

public class HeroIntl extends Hero{
    String type;

    public HeroIntl(String name, double health){
        super(name,health);
        this.type = "intel";
    }

    @Override
    public void display() {
        System.out.println(this.getName() + " is a " + this.type + " and health " + this.getHealth());
    }

    public void castMagic(){
        System.out.println("mengeluarkan magic ");
    }
}
