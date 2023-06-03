import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Zadanie3 {

    private String ID, imie;
    private int wiek;
    List<Zadanie3> objekty = new ArrayList<>();
    public Zadanie3(String ID, String imie, int wiek) {
        this.ID = ID;
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Zadanie3{" +
                "ID='" + ID + '\'' +
                ", imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zadanie3 zadanie3 = (Zadanie3) o;
        return wiek == zadanie3.wiek && Objects.equals(ID, zadanie3.ID) && Objects.equals(imie, zadanie3.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, imie, wiek);
    }

    public void filtruj18() {
        for (int i = 0; i < objekty.size(); i++) {
            if (objekty.get(i).getWiek() < 18) {
                objekty.remove(i);
            }
        }
    }

    public static void main(String[] args) {



    }
}
