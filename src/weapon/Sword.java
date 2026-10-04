package weapon;

public class Sword implements Weapon {
    @Override
    public String getAttackMessage() {
        return "swings a heavy steel sword";
    }

    @Override
    public int getDamage() {
        return 25;
    }
}