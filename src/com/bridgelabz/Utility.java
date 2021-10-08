package com.bridgelabz;

public class Utility<T> {

    public void insertionSort(String[] arr) {

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

    public void bubbleSort(Integer[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void binarySearch(String[] arr, String searchWord) {
        Integer mid = binarySearchRecursively(arr, 0, arr.length, searchWord);

        if (mid >= 0)
            System.out.println("FOUND");
        else
            System.out.println("NOT FOUND");
    }

    private Integer binarySearchRecursively(String[] arr, int left, int right, String searchWord) {
        int mid = left + (right - left) / 2;

        if (arr[mid].equals(searchWord))
            return mid;

        if (searchWord.compareTo(arr[mid]) < 0)
            return binarySearchRecursively(arr, left, mid - 1, searchWord);

        return binarySearchRecursively(arr, mid + 1, right, searchWord);
    }

    public void toPrint(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}