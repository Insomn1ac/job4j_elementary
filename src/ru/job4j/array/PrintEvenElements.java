package ru.job4j.array;

public class PrintEvenElements {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - 1 - i] % 2 == 0) {
                System.out.println("Текущий чётный элемент массива, начиная с последнего: "
                        + array[array.length - 1 - i]);
            }
        }
    }
}
