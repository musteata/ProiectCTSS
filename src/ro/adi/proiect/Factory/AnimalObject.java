package ro.adi.proiect.Factory;

public class AnimalObject {

	public String descriere;
	public float varsta;
	public double pret;
	public String getDescriere() {
		return descriere;
	}
	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}
	public float getVarsta() {
		return varsta;
	}
	public void setVarsta(float varsta) {
		this.varsta = varsta;
	}
	public double getPret() {
		return pret;
	}
	public void setPret(double pret) {
		this.pret = pret;
	}
	
	public AnimalObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AnimalObject(String descriere, float varsta, double pret) {
		super();
		this.descriere = descriere;
		this.varsta = varsta;
		this.pret = pret;
	}

}
