package org.vova.dmdev.level2.block1.housetask;

public class Floor {
    int floorNumber;
    Apartment[] apartments;

    public Floor(int floorNumber, Apartment[] apartments) {
        this.floorNumber = floorNumber;
        this.apartments = apartments;
    }

    public void print() {
        System.out.println("Этаж " + floorNumber + ", количество квартир " + apartments.length);
    }
}
