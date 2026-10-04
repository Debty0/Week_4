package character;

import weapon.Weapon;

public class Archer extends GameCharacter {
    public Archer(String name, Weapon weapon) {
        super(name, weapon);
    }

    @Override
    public void fight() {
        System.out.printf("Archer %s: %s! (Damage: %d)%n",
                name, weapon.getAttackMessage(), weapon.getDamage());
    }
}