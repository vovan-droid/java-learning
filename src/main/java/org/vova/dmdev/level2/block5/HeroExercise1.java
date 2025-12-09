package org.vova.dmdev.level2.block5;

public class HeroExercise1 {
    private String name;
    private int damage;

    public HeroExercise1(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void attackEnemy(EnemyExercise1 enemy) {
        System.out.println(name + " атакует врага " + enemy.getName());
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
