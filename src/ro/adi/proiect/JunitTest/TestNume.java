package ro.adi.proiect.JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.adi.proiect.Observer.Cumparatori;

public class TestNume {



	@Test
	public void testCifre() {

		Cumparatori c = new Cumparatori("452i","Bogdan" , "181822921", 42, null);
		JunitTeste test = new JunitTeste();
		boolean result=test.testNume(c.getNume());
		assertFalse(result);
			}
	
	@Test
	public void testLitere2() {

		Cumparatori c = new Cumparatori("ana", "Bogdan" , "181822921", 42, null);
		JunitTeste test = new JunitTeste();
		boolean result=test.testNume(c.getNume());
		assertTrue(result);
			}
	@Test
	public void testStringGol() {

		Cumparatori c = new Cumparatori("", "Bogdan" , "181822921", 42, null);
		JunitTeste test = new JunitTeste();
		boolean result=test.testNume(c.getNume());
		assertFalse(result);
			}
	
	@Test
	public void testNumeNull() {

		Cumparatori c = new Cumparatori(null, "Bogdan" , "181822921", 42, null);
		JunitTeste test = new JunitTeste();
		boolean result=test.testNume(c.getNume());
		assertFalse(result);
			}

}