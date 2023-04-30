package com.zadanie3;

public class Zadanie3 {

    public static void main(String[] args) {

        String[] tablica = new String[] { "jablko", "orzech", "banan", "pomarancza" };
        zamienNaDuze(tablica);
    }

    public static void zamienNaDuze(String[] array) {
        for (String element : array) {
            System.out.println(element.toUpperCase());
        }
    }
}
