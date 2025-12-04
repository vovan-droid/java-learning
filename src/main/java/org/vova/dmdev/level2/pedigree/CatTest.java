package org.vova.dmdev.level2.pedigree;

public class CatTest {

    static int counter = 0;

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
        if (cat != null) {
            printSpaces(counter);
            counter++;
            System.out.println(cat.name);
            printTree(cat.father);
            printTree(cat.mother);
            counter--;

        }
    }

    public static void printSpaces(int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.print("              ");
        }
    }
}
