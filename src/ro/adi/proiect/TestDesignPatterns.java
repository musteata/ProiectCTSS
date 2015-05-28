package ro.adi.proiect;

import ro.adi.proiect.Factory.AnimaleFactory;
import ro.adi.proiect.Factory.IAnimale;
import ro.adi.proiect.Observer.Animale;
import ro.adi.proiect.Observer.Cumparatori;
import ro.adi.proiect.Singletton.Proprietar;

public class TestDesignPatterns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/////////SINGLETON//////////
		Proprietar c = Proprietar.getInstanta();
		System.out.println(c.getNume() + " "+ c.getPrenume() + " "+ c.getCNP() + " "+ c.getNationalitate());
		
		
		/////////FACTORY//////////
		AnimaleFactory factory = new AnimaleFactory();
		IAnimale c1 = factory.getAnimale("Caine");
		c1.adaugarePret(10);		
		c1.afisareAnimal();
		IAnimale p1 = factory.getAnimale("Papagal");
			
		p1.afisareAnimal();
		IAnimale p2 = factory.getAnimale("Pisica");
				
		p2.afisareAnimal();
		
		
		/////////OBSERVER//////////
		Cumparatori cumparator = new Cumparatori("Georgian", "Nistor","1921109161314", 21, null);
		Cumparatori cumparator1 = new Cumparatori("Ana", "Mizil","1941211181716", 25, null);
		Animale anim = new Animale("Caine", "De vanzare");
		anim.adaugaObserver(cumparator);
		anim.adaugaObserver(cumparator1);
		
		anim.setStatus("NU");
	}

}
