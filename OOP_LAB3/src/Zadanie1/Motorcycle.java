package Zadanie1;

public class Motorcycle implements Drive {
    String motorcycleName;

    public Motorcycle(String motorcycleName) {
        if (motorcycleName != null) {
            this.motorcycleName = motorcycleName;
        } else {
            this.motorcycleName = "Emzetka";
        }
    }

    @Override
    public void drive() {
        System.out.println("The motorcycle " + motorcycleName + " drives!");
    }

    @Override
    public void noDrive() {
        System.out.println("The motorcycle " + motorcycleName + " doesn't drive!");
    }

    public String getMotorcycleName() {
        return motorcycleName;
    }

    public void setMotorcycleName(String motorcycleName) {
        this.motorcycleName = motorcycleName;
    }
}
