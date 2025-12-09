package org.vova.dmdev.level2.block5;

public class TrainingGroundExercise1 {

    public static void main(String[] args) {
        String nameHero1 = "Hero 1";
        HeroExercise1 hero1 = new HeroExercise1(nameHero1);
        System.out.println(hero1.getName());
        hero1.attackEnemy();
    }
}
