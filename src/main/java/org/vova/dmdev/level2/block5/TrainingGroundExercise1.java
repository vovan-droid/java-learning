package org.vova.dmdev.level2.block5;

public class TrainingGroundExercise1 {

    public static void main(String[] args) {
        HeroExercise1 hero = new HeroExercise1("Hero");
        System.out.println(hero.getName());
        hero.attackEnemy();
        System.out.println();

        WarriorExercise1 warrior = new WarriorExercise1("Warrior");
        System.out.println(warrior.getName());
        warrior.attackEnemy();
        System.out.println();

        MageExercise1 mage = new MageExercise1("Mage");
        System.out.println(mage.getName());
        mage.attackEnemy();
        System.out.println();

        ArcherExercise1 archer = new ArcherExercise1("Archer");
        System.out.println(archer.getName());
        archer.attackEnemy();
        System.out.println();
    }
}
