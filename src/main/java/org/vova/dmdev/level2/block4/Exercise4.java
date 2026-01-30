package org.vova.dmdev.level2.block4;

public class Exercise4 {

    public static void main(String[] args) {
        String text = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] nums1 = arrayNumsFromString(text);
        printArray(nums1);
        System.out.println(sumArrayNumsFromString(nums1));
    }

    public static int[] arrayNumsFromString (String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                counter++;
            }
        }
        int[] nums = new int[counter];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isDigit(ch)) {
                nums[index++] = ch - '0';
            }
        }
        return nums;
    }

    public static void printArray (int[] array) {
        for(int i : array) {
            System.out.print(i + " ");
        };
        System.out.println();
    }

    public static int sumArrayNumsFromString (int[] arrayNums) {
        int sum = 0;
        for (int n : arrayNums) {
            sum += n;
        }
        return sum;
    }
}
