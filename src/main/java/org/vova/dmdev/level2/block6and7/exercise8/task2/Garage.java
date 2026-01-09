package org.vova.dmdev.level2.block6and7.exercise8.task2;

import org.vova.dmdev.level2.block6and7.exercise8.task2.car.Brand;
import org.vova.dmdev.level2.block6and7.exercise8.task2.car.Car;
import org.vova.dmdev.level2.block6and7.exercise8.task2.car.Color;
import org.vova.dmdev.level2.block6and7.exercise8.task2.car.Model;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private Map<Car, Integer> cars = new HashMap<>();

    public void park(Car car) {
        int oldCount = cars.getOrDefault(car, 0);
        cars.put(car, oldCount + 1);
    }

    public void departure(Car car) {
        int oldCount = cars.getOrDefault(car, 0);
        int newCount = oldCount == 0 ? 0 : oldCount - 1;
        cars.put(car, newCount);
    }

    public int getCarCountByBrand(Brand brand) {
        int result = 0;
        for (Map.Entry<Car, Integer> cars : cars.entrySet()) {
            if (cars.getKey().getBrand().equals(brand)) {
                result += cars.getValue();
            }
        }
        return result;
    }

    public int getCarCountByColor(Color color) {
        int result = 0;
        for (Map.Entry<Car, Integer> cars : cars.entrySet()) {
            if (cars.getKey().getColor().equals(color)) {
                result += cars.getValue();
            }
        }
        return result;
    }

    public int getCarCountByYear(int year) {
        int result = 0;
        for (Map.Entry<Car, Integer> cars : cars.entrySet()) {
            if (cars.getKey().getYear() == year) {
                result += cars.getValue();
            }
        }
        return result;
    }

    public int getCarCountByModel(Model model) {
        int result = 0;
        for (Map.Entry<Car, Integer> cars : cars.entrySet()) {
            if (cars.getKey().getModel().equals(model)) {
                result += cars.getValue();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                '}';
    }
}
