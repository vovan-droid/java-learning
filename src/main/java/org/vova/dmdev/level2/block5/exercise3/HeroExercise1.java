package org.vova.dmdev.level2.block5;

public abstract class HeroExercise1 {
    private String name;
    private int damage;

    public HeroExercise1(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(EnemyExercise1 enemy);

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
