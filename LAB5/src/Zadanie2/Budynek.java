package Zadanie2;

import java.time.LocalDate;

public class Budynek {

    private String nazwa;
    private int rok_budowy;
    private int liczba_pieter;

    public Budynek(String nazwa, int rok_budowy, int liczba_pieter) {
        this.nazwa = nazwa;
        this.rok_budowy = rok_budowy;
        this.liczba_pieter = liczba_pieter;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getRok_budowy() {
        return rok_budowy;
    }

    public void setRok_budowy(int rok_budowy) {
        this.rok_budowy = rok_budowy;
    }

    public int getLiczba_pieter() {
        return liczba_pieter;
    }

    public void setLiczba_pieter(int liczba_pieter) {
        this.liczba_pieter = liczba_pieter;
    }

    public void show() {
        System.out.println("Nazwa budynku: " + this.nazwa);
        System.out.println("Rok budowy: " + this.rok_budowy);
        System.out.println("Liczba pieter: " + this.liczba_pieter);
        System.out.println("Ile lat ma: ");
        ileLat();
    }

    public void ileLat() {
        System.out.println(LocalDate.now().minusYears(this.rok_budowy));
    }
}
