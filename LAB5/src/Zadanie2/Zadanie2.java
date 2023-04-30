package Zadanie2;

import java.time.LocalDate;

public class Zadanie2 {

    public static void main(String[] args) {

        Budynek object1 = new Budynek("Apteka", 1991, 1);
        Budynek object2 = new Budynek("Teatr", 2008, 3);
        Budynek object3 = new Budynek("Kino", 1956, 5);

        object1.show();
        object2.show();
        object3.show();
    }
}
