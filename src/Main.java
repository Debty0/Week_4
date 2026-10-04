import character.*;
import weapon.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== GAME START ===\n");

        Weapon broadsword = new Sword();
        Weapon longbow = new Bow();
        Weapon Dagger = new Dagger();
        Weapon magicStaff = new Staff();

        GameCharacter arthur = new Warrior("Arthur", broadsword);
        GameCharacter merlin = new Mage("Merlin", magicStaff);
        GameCharacter ezio = new Assassin("Ezio", Dagger);
        GameCharacter robin = new Archer("Robin", longbow);

        System.out.println("--- PHASE 1 ---");
        arthur.fight();
        merlin.fight();
        ezio.fight();
        robin.fight();

        System.out.println("\n--- PHASE 2 ---");
        merlin.setWeapon(Dagger);
        robin.setWeapon(broadsword);

        arthur.fight();
        merlin.fight();
        robin.fight();

        System.out.println("\n=== BATTLE END ===");
    }
}