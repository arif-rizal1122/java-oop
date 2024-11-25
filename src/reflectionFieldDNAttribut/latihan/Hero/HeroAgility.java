package reflectionFieldDNAttribut.latihan.Hero;

public class HeroAgility extends Hero{

    public String nickName;
    private String heroType = "agility";

    public HeroAgility(String name, double health){
        super(name, health);
    }
    public void setNickName(String newNickName){
        this.nickName = newNickName;
    }
    public void displayAll(){
        this.display();
        System.out.println("hero_type " + this.heroType + " nick_name " + this.nickName );
    }

}
