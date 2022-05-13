package com.lab;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");

        //creating the objects
        Wizard Cyrelle = new Wizard("Jao", 10,120,200);
        Warlock Jao = new Warlock("Jao", 10, 110, 150);

        //the implementation of method nameDisplay();
        Cyrelle.nameDisplay();
        Cyrelle.nameDisplay();

        //start of the sequence
        Cyrelle.marvelStorm(Jao);
        Cyrelle.showStats();
        Cyrelle.showStats();

        Jao.wreckingBall(Cyrelle);
        //implementation of method showStats();
        Cyrelle.showStats();
        Jao.showStats();

        //the use of heal spell
        Cyrelle.healSpell();
        Cyrelle.showStats();
        Jao.showStats();

        Jao.wreckingBall(Cyrelle);
        Cyrelle.showStats();
        Jao.showStats();

        Cyrelle.daredevil(Jao);
        //the levelUp();method
        Cyrelle.levelUp();
    }
}