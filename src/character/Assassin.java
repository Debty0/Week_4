package character;

import weapon.Weapon;

public class Assassin extends GameCharacter {
    public Assassin(String name, Weapon weapon) {
        super(name, weapon);
    }

    @Override
    public void fight() {
        System.out.printf("Assassin %s: %s! (Damage: %d)%n",
                name, weapon.getAttackMessage(), weapon.getDamage());
    }
}