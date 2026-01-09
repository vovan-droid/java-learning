package org.vova.dmdev.level2.block6and7.exercise8.task2;

import org.vova.dmdev.level2.block6and7.exercise8.task2.car.*;

public class Task2Runner {

    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.park(new Car1(2020, Brand.VOLVO, Model.STATION_WAGON, Color.RED, CarClass.A, 1));
        garage.park(new Car1(2020, Brand.MERCEDES, Model.STATION_WAGON, Color.WHITE, CarClass.B, 2));
        garage.park(new Car2(2018, Brand.BMV, Model.SEDAN, Color.BLACK, CarClass.C, 2));
        garage.park(new Car2(2018, Brand.BMV, Model.SEDAN, Color.BLACK, CarClass.C, 2));
        System.out.println(garage.toString());
        System.out.println(garage.getCarCountByBrand(Brand.BMV));

        garage.departure(new Car2(2018, Brand.BMV, Model.SEDAN, Color.BLACK, CarClass.C, 2));
        System.out.println(garage.toString());
        System.out.println(garage.getCarCountByModel(Model.SEDAN));
    }
}
