package com.lab;

public class Warlock extends Character{
    Warlock(String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);
    }
    public void malverStorm(Character enemyCharacter) {
        int damagePoints = 70;
        int manaCost = 30;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with malverStorm (Damage - 50)");
        damageTarget(enemyCharacter, damagePoints);
    }
    public void wreckingBall(Character enemyCharacter){
        int damagePoints = 60;
        int manaCost = 40;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with wreckingBall (Damage - 70)");
        damageTarget(enemyCharacter, damagePoints);
    }
    public void healthThanos(){
        int heal=60;
        int manaThanos=60;

        healthPoints += heal;
        manaPoints += manaThanos;

        System.out.println(super.characterName +" use Spell Thanos (Health +"+ heal +")" + " (Mana +"+ manaThanos +")");
    }

}