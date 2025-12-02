package org.vova.dmdev.level2.block1.housetask;

public class House {
    int houseNumber;
    Floor[] floors;

    public House(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    public void print() {
        System.out.println("Дом " + houseNumber + ", количество этажей " + floors.length);
    }
}
