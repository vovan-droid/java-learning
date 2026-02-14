package org.vova.dmdev.level2.block16;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Task1Runner {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        System.out.println(car);
        System.out.println(generateInsert(car));
    }

    private static String generateInsert(Car car) {
        String template = "INSERT INTO %s.%s (%s) VALUES (%s);";
        Table annotation = car.getClass().getAnnotation(Table.class);
        Field[] declaredFields = car.getClass().getDeclaredFields();

        String fieldNames = Arrays.stream(declaredFields)
                .filter(field -> field.isAnnotationPresent(Column.class))
                .sorted(Comparator.comparing(Field::getName))
                .map(field -> field.getAnnotation(Column.class))
                .map(Column::name)
                .collect(Collectors.joining(", "));

        String fieldValues = Arrays.stream(declaredFields)
                .filter(field -> field.isAnnotationPresent(Column.class))
                .sorted(Comparator.comparing(Field::getName))
                .peek(field -> field.setAccessible(true))
                .map(field -> {
                    try {
                        return String.valueOf(field.get(car));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                        return "";
                    }
                })
                .map(value -> "'" + value + "'")
                .collect(Collectors.joining(", "));
        return String.format(template, annotation.schema(), annotation.name(), fieldNames, fieldValues);
    }
}
