package org.vova.dmdev.level2.block5;

public class EnemyExercise1 implements MortalExercise1 {
    private String name;
    private int health;

    public EnemyExercise1(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= Math.min(health, damage);
        System.out.println(name + " получил урон " + damage + ". Осталось " + health);
        ;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isMortal() {
        if (health <= 0) {
            return true;
        }
        return false;
    }
}
