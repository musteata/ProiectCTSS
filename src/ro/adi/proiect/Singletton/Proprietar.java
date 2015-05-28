package ro.adi.proiect.Singletton;

public class Proprietar {

	private String nume;
	private String prenume;
	private String CNP;
	private String nationalitate;

	
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

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

	public String getNationalitate() {
		return nationalitate;
	}

	public void setNationalitate(String nationalitate) {
		this.nationalitate = nationalitate;
	}

	public static void setInstanta(Proprietar instanta) {
		Proprietar.instanta = instanta;
	}
	
	private static Proprietar instanta;
	
	private Proprietar() 
	{	super();
		this.nume = "Musteata";
		this.prenume = "Adrian";
		this.CNP = "1671107162839";
		this.nationalitate = "Roman";
		
	}
	
	public static Proprietar getInstanta() {
		if(instanta ==null)
			instanta= new Proprietar();
		return instanta;
	}

	public void showMessage(){
		System.out.println("Client unic!");
	}

	
}
