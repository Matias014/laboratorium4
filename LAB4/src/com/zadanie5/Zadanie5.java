package com.zadanie5;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) {

        int[] tablica = new int[8];
        tablica = wpisz(tablica);

        System.out.println(Arrays.toString(tablica));

        posortuj(tablica);

        System.out.println(Arrays.toString(tablica));
    }

    public static int[] wpisz(int[] array) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbe: ");
            array[i] = input.nextInt();
        }

        return array;
    }

    public static void posortuj(int[] array) {
        int temp, j;
        // sortowanie przez wstawianie
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
