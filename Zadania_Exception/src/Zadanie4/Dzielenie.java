package Zadanie4;

public class Dzielenie {
    int firstNumber, secondNumber;

    public Dzielenie(int firstNumber, int secondNumber) throws ErrorDzielenie {
        this.firstNumber = firstNumber;

        if (secondNumber == 0) {
            throw new ErrorDzielenie("Nie mozna dzielic przez zero!");
        }

        System.out.println("Iloraz: " + firstNumber / secondNumber);
    }
}
