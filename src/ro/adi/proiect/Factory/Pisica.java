package ro.adi.proiect.Factory;


public class Pisica implements IAnimale{

	AnimalObject a = new AnimalObject();
	public void afisareAnimal() {
		System.out.println("Aceasta pisica are pretul de :"+a.pret);
		
	}

	public void adaugarePret(double pret) {
		a.pret = pret;
		
	}

}