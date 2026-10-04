package weapon;

public class Dagger implements Weapon {
    @Override
    public String getAttackMessage() {
        return "strikes quickly with a poisoned dagger";
    }

    @Override
    public int getDamage() {
        return 30;
    }
}