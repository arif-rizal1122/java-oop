package AbstractVsInterface.latihan.hero;

public class HeroIntl extends Hero implements ISpeelSkil,IAttackSkill{

    public HeroIntl(String name, double age){
        super(name, age);
    }

    public void spell(Hero enemy){
        System.out.println(this.getName() + " memegic " + enemy.getName());
    }
    public void attack(Hero enemy){
        System.out.println(this.getName() + " menyerang " + enemy.getName());
    }

}
