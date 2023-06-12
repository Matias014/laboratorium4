package Zadanie1;

public class Aeroplane implements Fly {
    String aeroplaneName;

    public Aeroplane(String aeroplaneName) {
        if (aeroplaneName != null) {
            this.aeroplaneName = aeroplaneName;
        } else {
            this.aeroplaneName = "Air_Force_One";
        }
    }

    @Override
    public void fly() {
        System.out.println("The aeroplane " + aeroplaneName + " flies!");
    }

    @Override
    public void noFly() {
        System.out.println("The aeroplane " + aeroplaneName + " doesn't fly!");
    }

    public String getAeroplaneName() {
        return aeroplaneName;
    }

    public void setAeroplaneName(String aeroplaneName) {
        this.aeroplaneName = aeroplaneName;
    }
}
