package weapon;

public class Bow implements Weapon {
    @Override
    public String getAttackMessage() {
        return "shoots a precise arrow from a bow";
    }

    @Override
    public int getDamage() {
        return 15;
    }
}