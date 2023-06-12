package Zadanie3;

public class Adres {
    private String ulica, kodPocztowy, miasto;
    private int numerDomu;

    public Adres(String ulica, String kodPocztowy, String miasto, int numerDomu) throws NieprawidlowyAdresException {
        if (ulica.equals(null)) {
            throw new NieprawidlowyAdresException("Ulica nie moze byc nullem!");
        } else {
            this.ulica = ulica;
        }

        if (kodPocztowy.equals(null)) {
            throw new NieprawidlowyAdresException("Kod pocztowy nie moze byc nullem!");
        } else {
            this.kodPocztowy = kodPocztowy;
        }

        if (miasto.equals(null)) {
            throw new NieprawidlowyAdresException("Miasto nie moze byc nullem!");
        } else {
            this.miasto = miasto;
        }

        if (numerDomu <= 0) {
            throw new NieprawidlowyAdresException("Numer domu nie moze byc ujemny!");
        } else {
            this.numerDomu = numerDomu;
        }
    }
}
