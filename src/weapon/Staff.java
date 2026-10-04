package weapon;

public class Staff implements Weapon {
    @Override
    public String getAttackMessage() {
        return "casts a magical bolt from an ancient staff";
    }

    @Override
    public int getDamage() {
        return 40;
    }
}