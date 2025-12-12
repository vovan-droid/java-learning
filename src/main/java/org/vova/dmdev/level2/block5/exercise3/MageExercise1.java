package org.vova.dmdev.level2.block5.exercise3;

public class MageExercise1 extends HeroExercise1 {
    public MageExercise1(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(EnemyExercise1 enemy) {
        System.out.println(getName() + " сотворил заклинание в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
