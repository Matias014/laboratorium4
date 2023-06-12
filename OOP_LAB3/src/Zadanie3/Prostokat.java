package Zadanie3;

public class Prostokat extends Figura {
	int wys = 0;
	int szer = 0;
	
	Prostokat(int wys, int szer, String kolor) {
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	public String opis() {
		return "Obkiekt klasy Prostokat";
	}
}