package org.vova.dmdev.level2.block6.exercise8.task2.car;

import java.util.Objects;

public class Car1 extends Car {
    private int ownField;

    public Car1(int year, Brand brand, Model model, Color color, CarClass carClass, int ownField) {
        super(year, brand, model, color, carClass);
        this.ownField = ownField;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car1 car1 = (Car1) o;
        return ownField == car1.ownField;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ownField);
    }

    public int getOwnField() {
        return ownField;
    }

    public void setOwnField(int ownField) {
        this.ownField = ownField;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "ownField=" + ownField +
                '}';
    }
}
