package com.bridgelabz;

public class BinaryWordSearch {

        public static void main(String[] args) {
            Utility<String> binarySearch = new Utility<>();

            String[] batchMate = {"Jiswindar", "Utkarsh", "Sumit", "Yogendra", "ShivRaj"};
            binarySearch.insertionSort(batchMate);
            binarySearch.binarySearch(batchMate, "Sumit");
            binarySearch.toPrint(batchMate);
        }
    }
