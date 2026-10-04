package character;

import weapon.Weapon;

public abstract class GameCharacter {
    protected Weapon weapon;
    protected String name;

    protected GameCharacter(String name, Weapon weapon) {
        validateWeapon(weapon);
        this.name = name;
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        validateWeapon(weapon);
        System.out.println(this.name + " equips a new weapon!");
        this.weapon = weapon;
    }

    public abstract void fight();

    private void validateWeapon(Weapon weapon) {
        if (weapon == null) {
            throw new IllegalArgumentException("Weapon cannot be null.");
        }
    }
}