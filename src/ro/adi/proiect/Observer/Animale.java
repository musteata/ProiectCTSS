package ro.adi.proiect.Observer;

import java.util.ArrayList;


public class Animale implements ISubjectObserver{


	private String tip;
	String status;
	private ArrayList<IObserver> lista = new ArrayList<IObserver>();
	
	
	public Animale() {
		super();
	}
	
	public Animale( String tip, String status) {
		super();
		this.tip = tip;
		this.status = status;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		notifyObserver();
	}

	public ArrayList<IObserver> getListaObs() {
		return lista;
	}

	public void setListaObs(ArrayList<IObserver> listaObs) {
		this.lista = listaObs;
	}

	public void adaugaObserver(IObserver observer) {
		lista.add(observer);
		
	}
	public void stergeObserver(IObserver observer) {
		lista.remove(observer);
		
	}
	public void notifyObserver() {
		System.out.println("Notifica cand animalul este de vanzare");
		for(IObserver ob:lista){
			ob.update(this.status);
		
	}
	}
}
