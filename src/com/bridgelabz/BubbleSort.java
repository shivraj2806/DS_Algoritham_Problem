package com.bridgelabz;

public class BubbleSort {

        public static void main(String[] args) {
            Utility<Integer> bubbleSort = new Utility<>();

            Integer[] arr = {56, 70, 30, 22, 67, 95, 40, 11, 63, 65, 3, 16};

            System.out.println("before Sorting :- ");
            bubbleSort.toPrint(arr);

            bubbleSort.bubbleSort(arr);

            System.out.println("\nafter sorting :- ");
            bubbleSort.toPrint(arr);
        }
}
