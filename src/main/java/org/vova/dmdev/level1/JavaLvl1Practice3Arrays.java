package org.vova.dmdev.level1;

public class JavaLvl1Practice3Arrays {

    public static void main(String[] args) {
        int[] array = {2, 10, 5, 5, 3, 2, 6, 0};
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {9, 1}
        };
        int[][] array2 = {
                {1, 2, 3},
                {4, 5, 6, 7},
        };
        ex2(array);
        ex1(array);
        System.out.println((ex3(array1, array2)));
        System.out.println(ex4(array));
    }

    public static void ex1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = array.length - 1 ; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void ex2(int[] array) {
        int currentIndex = 0;
        for (int currentValue = 1; currentIndex < array.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                array[currentIndex] = currentValue;
                currentIndex++;
            }
        }
    }

    public static boolean ex3(int[][] array1, int[][] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != array2[i][j] || array1.length != array2.length || array1[i].length != array2[i].length) {
                    return false;
                }
            }
        }
        return true;
    }


    public static int ex4(int[] array) {
        int minValue = array[0];
        int maxValue = array[0];
        int minValueIndex = 0;
        int maxValueIndex = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minValueIndex = i;
            }
            if (maxValue < array[i]) {
                maxValue = array[i];
                maxValueIndex = i;
            }
        }

        if (minValueIndex > maxValueIndex) {
            int x = minValueIndex;
            minValueIndex = maxValueIndex;
            maxValueIndex = x;
        }
        for (int i = minValueIndex + 1; i < maxValueIndex; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
