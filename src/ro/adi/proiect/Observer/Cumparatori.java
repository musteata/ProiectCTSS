package ro.adi.proiect.Observer;


public class Cumparatori implements IObserver{
	private String nume;
	private String prenume;
	private String cnp;
	private int varsta;
	private String telefonMObil;
	
	public boolean TelefonMobil()
	{
		if(telefonMObil.charAt(0)==0 && telefonMObil.charAt(1)==7)
			return true;
		else 
			return false;
		
	}
	 public boolean CnpValid(){
	   	 if(cnp.length() == 13)
	   		 return true;
	   	 else
			return false;    	
	   }
	
	 public boolean Telefonvalids(){
	   	 if(telefonMObil.length() == 10)
	   		 return true;
	   	 else
			return false;    	
	   }

	
	public Cumparatori() {
		super();
	}

	public Cumparatori(String nume, String prenume, String cnp, int varsta, String telefon) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.cnp = cnp;
		this.varsta = varsta;
		this.telefonMObil = telefon;
	}
	public boolean CnpValidDupa2000(){
	   	 if(cnp.charAt(0) == 6 || cnp.charAt(0)==5 )
	   		 return true;
	   	 else
	   		 return false;
	}

	public String getNume() {
		return nume;
	}
	

	public void setNume(String nume) {
		this.nume = nume;
	}


	public String getPrenume() {
		return prenume;
	}

	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}


	public String getCnp() {
		return cnp;
	}


	public void setCnp(String cnp) {
		this.cnp = cnp;
	}


	public int getVarsta() {
		return varsta;
	}


	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}


	public String getTelefonMObil() {
		return telefonMObil;
	}


	public void setTelefonMObil(String telefonMObil) {
		this.telefonMObil = telefonMObil;
	}


	public void update(String status) {
		System.out.println("Animalul pe care doriti sa il cumparati " + status + " e de vanzare");
		
	}

}
