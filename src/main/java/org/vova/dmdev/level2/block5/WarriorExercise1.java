package org.vova.dmdev.level2.block5;

public class WarriorExercise1 extends HeroExercise1 {
    public WarriorExercise1(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(EnemyExercise1 enemy) {
        System.out.println(getName() + " взмахнул мечом в" + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
