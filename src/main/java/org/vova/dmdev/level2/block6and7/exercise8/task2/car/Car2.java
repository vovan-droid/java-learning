package org.vova.dmdev.level2.block6and7.exercise8.task2.car;

import java.util.Objects;

public class Car2 extends Car {
    private int ownField1;

    public Car2(int year, Brand brand, Model model, Color color, CarClass carClass, int ownField1) {
        super(year, brand, model, color, carClass);
        this.ownField1 = ownField1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car2 car2 = (Car2) o;
        return ownField1 == car2.ownField1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ownField1);
    }

    public int getOwnField1() {
        return ownField1;
    }

    public void setOwnField1(int ownField1) {
        this.ownField1 = ownField1;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "ownField1=" + ownField1 +
                '}';
    }
}
