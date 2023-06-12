package Zadanie1;

public class Train implements Drive {
    String trainName;

    public Train(String trainName) {
        if (trainName != null) {
            this.trainName = trainName;
        } else {
            this.trainName = "PKP_Intercity";
        }
    }

    @Override
    public void drive() {
        System.out.println("The train " + trainName + " drives!");
    }

    @Override
    public void noDrive() {
        System.out.println("The train " + trainName + " doesn't drive!");
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }
}
