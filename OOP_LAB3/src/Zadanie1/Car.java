package Zadanie1;

public class Car implements Drive {
    String carName;

    public Car(String carName) {
        if (carName != null) {
            this.carName = carName;
        } else {
            this.carName = "Fiat_punto";
        }
    }

    @Override
    public void drive() {
        System.out.println("The car " + carName + " drives!");
    }

    @Override
    public void noDrive() {
        System.out.println("The car " + carName + " doesn't drive!");
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
