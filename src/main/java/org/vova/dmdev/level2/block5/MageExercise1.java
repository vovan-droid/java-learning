package org.vova.dmdev.level2.block5;

public class MageExercise1 extends HeroExercise1 {
    public MageExercise1(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() + " сотворил заклинание");
    }
}
