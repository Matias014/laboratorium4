package com.zadanie4;

import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {

        String[] tablica = wpisz(5);
        wypisz(tablica);
    }

    public static String[] wpisz(int sizeOfArray) {
        String[] array = new String[sizeOfArray];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj " + (i + 1) + " slowo: ");
            array[i] = input.next();
        }

        return array;
    }

    public static void wypisz(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length() - 1; j >= 0; j--) {
                System.out.print(array[i].charAt(j));
            }
            System.out.println();
        }
    }
}
