package ro.adi.proiect.Observer;


public interface ISubjectObserver {
	public void adaugaObserver(IObserver observer);
	public void stergeObserver(IObserver observer);
	public void notifyObserver();
}
