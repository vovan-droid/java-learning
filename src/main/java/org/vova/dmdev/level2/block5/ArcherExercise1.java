package org.vova.dmdev.level2.block5;

public class ArcherExercise1 extends HeroExercise1 {
    public ArcherExercise1(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Герой Archer атакует врага");
    }
}
