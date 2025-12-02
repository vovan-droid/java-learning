package org.vova.dmdev.level2.block1.housetask;

public class JavaLvl2Exercise1 {

    public static void main(String[] args) {
        Room room1 = new Room(true);
        Room room2 = new Room(false);
        Room room3 = new Room(false);
        Room room4 = new Room(false);
        Room room5 = new Room(true);
        Room room6 = new Room(false);
        Room room7 = new Room(true);
        Room room8 = new Room(false);
        Room room9 = new Room(false);
        Room room10 = new Room(false);

        Apartment apartment1 = new Apartment(18, new Room[]{room1, room2});
        Apartment apartment2 = new Apartment(19, new Room[]{room3, room4});
        Apartment apartment3 = new Apartment(20, new Room[]{room5, room6});
        Apartment apartment4 = new Apartment(21, new Room[]{room7, room8, room9, room10});

        Floor floor1 = new Floor(1, new Apartment[]{apartment1, apartment2,});
        Floor floor2 = new Floor(2, new Apartment[]{apartment3, apartment4,});

        House house = new House(1, new Floor[]{floor1, floor2});

        printAllInformation(house);
    }

    public static void printAllInformation(House house) {
        house.print();
        for (int i = 0; i < house.floors.length; i++) {
            System.out.print("  ");
            house.floors[i].print();
            for (int j = 0; j < house.floors[i].apartments.length; j++) {
                System.out.print("    ");
                house.floors[i].apartments[j].print();
                for (int k = 0; k < house.floors[i].apartments.length; k++) {
                    System.out.print("      ");
                    house.floors[i].apartments[j].rooms[k].print();
                }
            }
        }
    }
}