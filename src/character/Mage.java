package character;

import weapon.Weapon;

public class Mage extends GameCharacter {
    public Mage(String name, Weapon weapon) {
        super(name, weapon);
    }

    @Override
    public void fight() {
        System.out.printf("Mage %s: %s! (Damage: %d)%n",
                name, weapon.getAttackMessage(), weapon.getDamage());
    }
}