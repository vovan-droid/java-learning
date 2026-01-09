package org.vova.dmdev.level2.block8;

import org.vova.dmdev.level2.block8.exercise5.MyOwnException;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

public class Exercise6 {

    public static final Map<Integer, Throwable> EXCEPTIONS = Map.of(0, new RuntimeException("runtime"),
            1, new FileNotFoundException("file not found"),
            2, new IndexOutOfBoundsException("index exception")
    );

    public static void main(String[] args) {
        Random random = new Random();
        try {
            throwRandomException(random.nextInt(3));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }

    public static void throwRandomException(int randomValue) throws Throwable {
        Throwable exception = EXCEPTIONS.getOrDefault(randomValue, new MyOwnException("not found"));
        throw exception;
    }
}
