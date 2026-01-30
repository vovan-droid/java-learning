package org.vova.dmdev.level2.pedigree;

public class CatTest {

    public static final String SPACES = "  ";

    public static void main(String[] args) {
        Cat grandGrandFather1 = new Cat("Bailey");
        Cat grandGrandMother1 = new Cat("Ulivia");
        Cat grandGrandFather2 = new Cat("Wotan");
        Cat grandGrandMother2 = new Cat("Mia");
        Cat grandGrandFather3 = new Cat("Fee-Loona");
        Cat grandGrandMother3 = new Cat("Afonya");
        Cat grandGrandFather4 = new Cat("Moon-Devil");
        Cat grandGrandMother4 = new Cat("Lynwood");

        Cat grandFather1 = new Cat("Zumba", grandGrandFather1, grandGrandMother1);
        Cat grandMother1 = new Cat("Nina", grandGrandFather2, grandGrandMother2);
        Cat grandFather2 = new Cat("Adonis", grandGrandFather3, grandGrandMother3);
        Cat grandMother2 = new Cat("Darkoceans", grandGrandFather4, grandGrandMother4);

        Cat father = new Cat("Unity", grandFather1, grandMother1);
        Cat mother = new Cat("Frieda", grandFather2, grandMother2);

        Cat marquis = new Cat("Marquis", father, mother);


        printTree(marquis);
    }


    public static void printTree(Cat cat) {
        printTree(cat, 0, "");
    }


    public static void printTree(Cat cat, int level, String prefix) {
        if (cat != null) {
            System.out.println(SPACES.repeat(level) + prefix + cat.name);
            printTree(cat.father, level + 1, "Father: ");
            printTree(cat.mother, level + 1, "Mother: ");
        }
    }
}