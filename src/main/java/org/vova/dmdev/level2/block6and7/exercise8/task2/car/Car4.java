package org.vova.dmdev.level2.block6and7.exercise8.task2.car;

import java.util.Objects;

public class Car4 extends Car {
    private int ownField3;

    public Car4(int year, Brand brand, Model model, Color color, CarClass carClass, int ownField3) {
        super(year, brand, model, color, carClass);
        this.ownField3 = ownField3;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car4 car4 = (Car4) o;
        return ownField3 == car4.ownField3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ownField3);
    }

    public int getOwnField3() {
        return ownField3;
    }

    public void setOwnField3(int ownField3) {
        this.ownField3 = ownField3;
    }

    @Override
    public String toString() {
        return "Car4{" +
                "ownField3=" + ownField3 +
                '}';
    }
}
