package Zadanie1;

public class Main {
    public static void main(String[] args) {
        Aeroplane object1 = new Aeroplane("Lufthansa");
        Bike object2 = new Bike("Trekking");
        Car object3 = new Car("Mazda_RX_7");
        Motorcycle object4 = new Motorcycle("Komar");
        Ship object5 = new Ship("Yacht");
        Train object6 = new Train("Cargo");

        object1.fly();
        object1.noFly();

        object2.drive();
        object2.noDrive();

        object3.drive();
        object3.noDrive();

        object4.drive();
        object4.noDrive();

        object5.swim();
        object5.noSwim();

        object6.drive();
        object6.noDrive();
    }
}
