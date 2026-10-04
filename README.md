# Bridge Pattern: Characters and Weapons

## Description
This repository contains a Java implementation of the Bridge structural design pattern.
The domain focuses on a role-playing game where `GameCharacter` (Abstraction) and `Weapon` (Implementor) vary independently.

## Structure
- **Abstraction**: `GameCharacter`
- **Refined Abstractions**: `Warrior`, `Mage`
- **Implementor**: `Weapon`
- **Concrete Implementors**: `Sword`, `Bow`

## How to Run
Compile and run the `Main` class. It demonstrates switching a character's weapon at runtime without modifying the character classes.