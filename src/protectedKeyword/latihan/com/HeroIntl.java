package protectedKeyword.latihan.com;

// inheritance dari abstract hero
public class HeroIntl extends Hero {

    public HeroIntl(String name){
        super(name);
    }

    public void levelUp(){
       this.setLevel(4);
    }

}
