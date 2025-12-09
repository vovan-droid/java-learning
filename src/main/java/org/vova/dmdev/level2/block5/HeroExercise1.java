package org.vova.dmdev.level2.block5;

public class HeroExercise1 {
    private String name;

    public HeroExercise1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy() {
        System.out.println("Герой атакует врага");
    }
}
