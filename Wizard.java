package com.lab;

public class Wizard extends Character {
    Wizard (String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);
    }

    //this 2 methods is the attack spells
    public void daredevil(Character enemyCharacter) {
        int damagePoints = 50;
        int manaCost = 30;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with daredevil (Damage - 50)");
        damageTarget(enemyCharacter, damagePoints);
    }
    public void marvelStorm(Character enemyCharacter){
        int damagePoints = 70;
        int manaCost = 45;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with marvelStorm (Damage - 70)");
        damageTarget(enemyCharacter, damagePoints);
    }

    //this method is the heal spell
    public void healSpell(){
        int heal=80;
        int manaThanos=60;

        healthPoints += heal;
        manaPoints += manaThanos;

        System.out.println(super.characterName +" use Spell Thanos (Health +"+ heal +")" + " (Mana +"+ manaThanos +")");
    }
    }