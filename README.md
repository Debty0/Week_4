## Project
This project implements the Bridge structural design pattern in Java. The domain is Game Characters and Weapons. The pattern separates the character abstraction from the weapon implementation. This prevents class explosion and allows changing weapons dynamically at runtime.

## Structure
* Abstraction: GameCharacter
* Refined Abstractions: Warrior, Mage, Assassin, Archer
* Implementor: Weapon
* Concrete Implementors: Sword, Bow, Dagger, Staff

## Clean Code Principles
1. Clear separation of responsibilities: Packages separate abstraction and implementation.
2. Meaningful names: Methods clearly describe their purpose.
3. Small focused classes: Each class has a single responsibility.
4. No duplicated logic: Validation is centralized in the base class.
5. Backward compatible design: Adding new weapons requires zero changes to character classes.

## How to Run
1. Clone the repository.
2. Open the project in IntelliJ IDEA using JDK 17.
3. Run Main.java.