package com.bridgelabz;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
            Utility<Integer> magicNumber = new Utility<>();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter N");
            int N = scanner.nextInt();
            System.out.println("Think of a number between 0 to " + N);

            magicNumber.searchMagicNum(N);
            System.out.println("CONGRATULATIONS - you have found your number");


        }
}
