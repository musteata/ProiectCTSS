package ro.adi.proiect.Factory;



public class AnimaleFactory {
	public IAnimale getAnimale(String tipAnimal){
		if(tipAnimal == null)
			return null;
		else if(tipAnimal.equalsIgnoreCase("Caine"))
		{	
		return new Caine();
		}
		else if(tipAnimal.equalsIgnoreCase("Papagal")){
			
			return new Papagal();
		}else if(tipAnimal.equalsIgnoreCase("Pisica"))
			return new Pisica();
		return null;
		
		
		
	}
	
	
}