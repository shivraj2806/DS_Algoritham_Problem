package com.bridgelabz;

public class InsertionSort {

        public static void main(String[] args) {
            Utility<String> insertionSort = new Utility<>();

            String[] batchMate = {"Jiswindar", "Utkarsh", "Sumit", "Yogendra", "ShivRaj"};

            System.out.println("before Sorting :- ");
            insertionSort.toPrint(batchMate);

            insertionSort.sort(batchMate);

            System.out.println("\nafter sorting :- ");
            insertionSort.toPrint(batchMate);
        }

}
