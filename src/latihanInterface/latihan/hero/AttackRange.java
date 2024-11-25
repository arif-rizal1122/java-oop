package latihanInterface.latihan.hero;

public class AttackRange implements IAttackSkill{
    private double power;

    public AttackRange(double power){
        this.power = power;
    }

    @Override
    public void attack(Hero enemy) {
        System.out.println("attack " + enemy.getName() + " with power " + this.power);
    }
}
