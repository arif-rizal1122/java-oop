package AbstractVsInterface.latihan.hero;

public class HeroAgility extends Hero implements IAttackSkill{

    public HeroAgility(String name, double age){
        super(name, age);
    }

    public void attack(Hero enemy){
        System.out.println(this.getName() + " menyerang " + enemy.getName());
    }


}
