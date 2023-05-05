import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        tworzTabele();
        dodajStudenta();
        pokazObecnosc();
    }

    public static void tworzTabele() {
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE LISTA_OBECNOSCI " +
                    "(PROWADZACY CHAR(100) NOT NULL," +
                    "PRZEDMIOT CHAR(100) NOT NULL," +
                    "STUDENT CHAR(100) NOT NULL," +
                    "NR_ALBUMU INT NOT NULL," +
                    "DATA_ZAJEC CHAR(100) NOT NULL," +
                    "CZAS_ZALOGOWANIA CHAR(100)," +
                    "CZAS_WYLOGOWANIA CHAR(100)," +
                    "DLUGOSC_NA_SESJI CHAR(100));";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }
    public static void dodajStudenta() {
        Connection c = null;
        Statement stmt = null;

        String prowadzacy;
        String przedmiot;
        String student;
        int nr_albumu;
        String data_zajec;
        String czas_zalogowania;
        String czas_wylogowania;
        String dlugosc_na_sesji;

        System.out.print("Podaj prowadzacego: ");
        prowadzacy = getString();

        System.out.print("Podaj przedmiot: ");
        przedmiot = getString();

        System.out.print("Podaj studenta: ");
        student = getString();

        System.out.print("Podaj nr_albumu: ");
        nr_albumu = getInt();

        System.out.print("Podaj date zajec: ");
        data_zajec = getString();

        System.out.print("Podaj czas zalogowania: ");
        czas_zalogowania = getString();

        System.out.print("Podaj czas wylogowania: ");
        czas_wylogowania = getString();

        System.out.print("Podaj dlugosc na sesji: ");
        dlugosc_na_sesji = getString();

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO LISTA_OBECNOSCI (PROWADZACY," +
                    "PRZEDMIOT,STUDENT,NR_ALBUMU,DATA_ZAJEC,CZAS_ZALOGOWANIA," +
                    "CZAS_WYLOGOWANIA,DLUGOSC_NA_SESJI) VALUES" +
                    "('" + prowadzacy + "','" + przedmiot + "','" + student +
                    "'," + nr_albumu + ",'" + data_zajec + "','" + czas_zalogowania
                    + "','" + czas_wylogowania + "','" + dlugosc_na_sesji + "');";

            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }
    public static void pokazObecnosc() {
        /* Funkcja wyświetlająca obecności wszystkich studentów na zajęciach*/
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM LISTA_OBECNOSCI;");

            while (rs.next()) {
                String prowadzacy = rs.getString("prowadzacy");
                String przedmiot = rs.getString("przedmiot");
                String student = rs.getString("student");
                int nr_albumu = rs.getInt("nr_albumu");
                String data_zajec = rs.getString("data_zajec");
                String czas_zalogowania = rs.getString("czas_zalogowania");
                String czas_wylogowania = rs.getString("czas_wylogowania");
                String dlugosc_na_sesji = rs.getString("dlugosc_na_sesji");

                System.out.println("PROWADZACY = " + prowadzacy);
                System.out.println("PRZEDMIOT = " + przedmiot);
                System.out.println("STUDENT = " + student);
                System.out.println("NR_ALBUMU = " + nr_albumu);
                System.out.println("DATA_ZAJEC = " + data_zajec);
                System.out.println("CZAS_ZALOGOWANIA = " + czas_zalogowania);
                System.out.println("CZAS_WYLOGOWANIA = " + czas_wylogowania);
                System.out.println("DLUGOSC_NA_SESJI = " + dlugosc_na_sesji);
                System.out.println();
            }

            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
    public static String getString() {
        return new Scanner(System.in).next();
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}