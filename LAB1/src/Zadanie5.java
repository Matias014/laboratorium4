public class Zadanie5 {

    public static void main(String[] args) {


    }

    public static int potega3(int liczba) {
        int temp = liczba;

        for (int i = 2; i <= 3; i++) {
            temp *= liczba;
        }

        return temp;
    }
}
