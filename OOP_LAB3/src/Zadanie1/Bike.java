package Zadanie1;

public class Bike implements Drive {
    String bikeName;

    public Bike(String bikeName) {
        if (bikeName != null) {
            this.bikeName = bikeName;
        } else {
            this.bikeName = "Cross";
        }
    }

    @Override
    public void drive() {
        System.out.println("The bike " + bikeName + " drives!");
    }

    @Override
    public void noDrive() {
        System.out.println("The bike " + bikeName + " doesn't drive!");
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }
}
