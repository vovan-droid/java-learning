package org.vova.dmdev.level2.block5;

public class TrainingGroundExercise1 {

    public static void main(String[] args) {
        HeroExercise1 hero = new HeroExercise1("Hero");
        hero.attackEnemy();
        System.out.println();

        HeroExercise1 warrior = new WarriorExercise1("Боромир");
        warrior.attackEnemy();
        System.out.println();

        HeroExercise1 mage = new MageExercise1("Гэндольф");
        mage.attackEnemy();
        System.out.println();

        HeroExercise1 archer = new ArcherExercise1("Леголас");
        archer.attackEnemy();
        System.out.println();

        attackEnemy(warrior, mage, archer);
    }

    public static void attackEnemy(HeroExercise1... heroes) {
        for (HeroExercise1 hero : heroes) {
            hero.attackEnemy();
        }
    }
}
