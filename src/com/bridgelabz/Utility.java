package com.bridgelabz;

public class Utility<T extends Comparable<T>> {

    public void toPrint(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    public void insertionSort(T[] arr) {

        for (int i = 1; i < arr.length; i++) {
            T value = arr[i];
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

    public void search(String[] arr, String searchWord) {
        Integer mid = binarySearch(arr, 0, arr.length, searchWord);

        if (mid >= 0)
            System.out.println("FOUND");
        else
            System.out.println("NOT FOUND");
    }

    private Integer binarySearch(String[] arr, int left, int right, String searchWord) {
        int mid = left + (right - left) / 2;

        if (arr[mid].equals(searchWord))
            return mid;

        if (searchWord.compareTo(arr[mid]) < 0)
            return binarySearch(arr, left, mid - 1, searchWord);

        return binarySearch(arr, mid + 1, right, searchWord);
    }

    public boolean Anagram(String word1, String  word2) {
        char[] wordArr1 = this.splitWord(word1);
        char[] wordArr2 = this.splitWord(word2);

        int lengthWord1 = wordArr1.length;
        int lengthWord2 = wordArr2.length;

        if (lengthWord1 != lengthWord2)
            return false;

        this.insertionSort(wordArr1);
        this.insertionSort(wordArr2);

        for (int i = 0; i < lengthWord1; i++)
            if (wordArr1[i] != wordArr2[i])
                return false;

        return true;
    }

    private char[] splitWord(String word) {
        char[] arr = new char[word.length()];
        for (int i = 0; i < word.length(); i++)
            arr[i] = word.charAt(i);
        return arr;
    }

    private void insertionSort(char[] arr) {

        for (int i = 1; i < arr.length; i++) {
            char value = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > (value)) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
    }
}