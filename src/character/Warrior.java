package character;

import weapon.Weapon;

public class Warrior extends GameCharacter {
    public Warrior(String name, Weapon weapon) {
        super(name, weapon);
    }

    @Override
    public void fight() {
        System.out.printf("Warrior %s: %s! (Damage: %d)%n",
                name, weapon.getAttackMessage(), weapon.getDamage());
    }
}