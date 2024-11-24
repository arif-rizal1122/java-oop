package protectedKeyword.latihan.Hero;

public class HeroStreght extends Hero{

    public HeroStreght(String name){
        super(name);
    }

    public void display(){
        System.out.println("ini hero streght " + this.name);
        System.out.println(this.getLevel());
    }

}
