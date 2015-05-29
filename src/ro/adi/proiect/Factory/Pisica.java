package ro.adi.proiect.Factory;


public class Pisica implements IAnimale{

	AnimalObject a = new AnimalObject();
	public void afisareAnimal() {
		System.out.println("Acest " + a.descriere + " are varsta de " + a.varsta + " ani" + " si pretul de " +a.pret +" lei");
		
	}

	public void adaugarePret(double pret) {
		a.pret = pret;
		
	}

	public void creareAnimal(String descriere, float varsta, double pret) {
		// TODO Auto-generated method stub
		a= new AnimalObject(descriere, varsta, pret);
	}

}