package org.vova.dmdev.level2.block1.housetask;

public class Apartment {
    int apartmentNumber;
    Room[] rooms;

    Apartment(int apartmentNumber, Room[] rooms) {
        this.apartmentNumber = apartmentNumber;
        this.rooms = rooms;
    }

    public void print() {
        System.out.println("Квартира номер " + apartmentNumber + ", количество комнат " + rooms.length);
    }
}
