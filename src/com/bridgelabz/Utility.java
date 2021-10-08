package com.bridgelabz;

public class Utility<T> {

    public void sort(String[] arr) {

        for (int i = 1; i < arr.length; i++) {
            String value = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(value) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
    }

    public void toPrint(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}