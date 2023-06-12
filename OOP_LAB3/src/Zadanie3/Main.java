package Zadanie3;

public class Main {
    public static void main(String[] args) {
        Prostokat maly_punkt = new Prostokat(3, 6, "czerwony");
        Trojkat rownoboczny = new Trojkat(7, 4, "bia³y");
        Kwadrat kwadracik = new Kwadrat(1, "zielony");
        //maly_punkt.zwieksz(3,4);

        System.out.println(maly_punkt.opis());
        System.out.println(rownoboczny.opis());
        System.out.println(kwadracik.opis());

        Figura[] tablicaFigur = new Figura[10];

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                tablicaFigur[i] = new Prostokat(1, 1, "rozowy");
            } else if (i % 2 != 0) {
                tablicaFigur[i] = new Trojkat(1,1, "czarny");
            }
        }

        for (int i = 0; i < 10; i++) {
            tablicaFigur[i].opis();
        }
    }
}