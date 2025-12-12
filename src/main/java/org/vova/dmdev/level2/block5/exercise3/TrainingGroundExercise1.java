package org.vova.dmdev.level2.block5.exercise3;

public class TrainingGroundExercise1 {

    public static void main(String[] args) {
        HeroExercise1 warrior = new WarriorExercise1("Боромир", 15);
        HeroExercise1 mage = new MageExercise1("Гэндольф", 20);
        HeroExercise1 archer = new ArcherExercise1("Леголас", 10);

        EnemyExercise1 enemy = new EnemyExercise1("Зомби", 100);

        attackEnemy(enemy, warrior, mage, archer);
    }

    public static void attackEnemy(EnemyExercise1 enemy, HeroExercise1... heroes) {
        while (enemy.isAlive()) {
            for (HeroExercise1 hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
