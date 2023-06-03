import java.util.ArrayList;
import java.util.List;

public class Zadanie4 {

    private String imie, nazwisko;

    public Zadanie4(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public static void main(String[] args) {

        Zadanie4[] objekty = new Zadanie4[2];
        objekty[0] = new Zadanie4("Jan", "Kowalski");
        objekty[1] = new Zadanie4("Marek", "Kowalski");

        List<Zadanie4> objekty2 = new ArrayList<>();
        objekty2.addAll(List.of(objekty));

        objekty2.remove(objekty2.subList(1, 2));
    }
}
