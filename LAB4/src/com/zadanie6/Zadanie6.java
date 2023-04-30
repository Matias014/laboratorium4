package com.zadanie6;

import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {

        int[] tablica = wpisz(5);

        for (int i = 0; i < 5; i++) {
            System.out.println(tablica[i] + "! = " + silnia(tablica[i]));
        }
    }

    public static int[] wpisz(int sizeOfArray) {
        int[] array = new int[sizeOfArray];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbe: ");
            array[i] = input.nextInt();
        }

        return array;
    }

    public static long silnia(int n) {
        int temp = 1;

        for (int i = 1; i <= n; i++) {
            temp *= i;
        }

        return temp;
    }
}
