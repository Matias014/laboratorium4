package com.zadanie1;

import java.util.Arrays;
import java.util.Random;

public class Zadanie1 {

    public static void main(String[] args) {

        int[] tablica = losowanie();
        System.out.println("Suma elementow: " + suma(tablica));
        System.out.println("Srednia elementow: " + srednia(tablica));
    }

    public static int suma(int[] array) {
        int suma = 0;

        for (int element : array) {
            suma += element;
        }

        return suma;
    }

    public static double srednia(int[] array) {
        return suma(array) / array.length;
    }

    public static int[] losowanie() {
        int[] testArray = new int[new Random().nextInt(100) + 1];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = new Random().nextInt(100);
        }

        return testArray;
    }
}
