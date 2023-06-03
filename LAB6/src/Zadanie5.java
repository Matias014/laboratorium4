import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zadanie5 {

    public static void main(String[] args) {

        List<Integer> liczby1 = new ArrayList<>();
        List<Integer> liczby2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            liczby1.add(i);
        }

        Iterator<Integer> someNumbersIterator = liczby1.iterator();

        int a = liczby1.size() - 1;

        while (someNumbersIterator.hasNext()) {
            if (a < 0) {
                break;
            }
            liczby2.add(liczby1.get(a));
            a--;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(liczby2.get(i));
        }
    }
}
