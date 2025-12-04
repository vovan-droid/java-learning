package org.vova.dmdev.level2.pedigree;

public class Cat {
    String name;
    Cat father;
    Cat mother;



    Cat(String name) {
        this.name = name;
    }

    Cat(String name, Cat father, Cat mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }
}

