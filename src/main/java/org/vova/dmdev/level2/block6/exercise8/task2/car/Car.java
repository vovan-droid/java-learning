package org.vova.dmdev.level2.block6.exercise8.task2.car;

import java.util.Objects;

public abstract class Car {
    private int year;
    private Brand brand;
    private Model model;
    private Color color;
    private CarClass carClass;

    public Car(int year, Brand brand, Model model, Color color, CarClass carClass) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.carClass = carClass;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && brand == car.brand && model == car.model && color == car.color && carClass == car.carClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, color, carClass);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model=" + model +
                ", year=" + year +
                ", color=" + color +
                ", carClass=" + carClass +
                '}';
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }
}
