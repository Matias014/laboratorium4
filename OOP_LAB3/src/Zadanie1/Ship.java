package Zadanie1;

public class Ship implements Swim {
    String shipName;

    public Ship(String shipName) {
        if (shipName != null) {
            this.shipName = shipName;
        } else {
            this.shipName = "Cargo_ship";
        }
    }

    @Override
    public void swim() {
        System.out.println("The ship " + shipName + " swims!");
    }

    @Override
    public void noSwim() {
        System.out.format("The ship %s doesn't swim!\n", shipName);
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
}
