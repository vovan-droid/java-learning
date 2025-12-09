package org.vova.dmdev.level2.block5;

public class WarriorExercise1 extends HeroExercise1 {
    public WarriorExercise1(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() + " взмахнул мечом");
    }
}
