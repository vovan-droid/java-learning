package org.vova.dmdev.level2.block5;

public class ArcherExercise1 extends HeroExercise1 {
    public ArcherExercise1(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(EnemyExercise1 enemy) {
        System.out.println(getName() + " стрельнул из лука в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
