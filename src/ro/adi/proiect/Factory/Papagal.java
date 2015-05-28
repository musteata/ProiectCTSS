package ro.adi.proiect.Factory;


public class Papagal implements IAnimale{
	AnimalObject a = new AnimalObject();
	public void afisareAnimal() {
		System.out.println("Acest papagal are pretul de :"+a.pret);
		
	}

	public void adaugarePret(double pret) {
		a.pret = pret;
		
	}

}