package ro.adi.proiect.JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.adi.proiect.Observer.Cumparatori;

public class TestMajor {

	@Test
	public void testNormalValue() {
		Cumparatori c = new Cumparatori("Gigel","Bogdan" , "181822921", 19, null);
		JunitTeste test = new JunitTeste();
		boolean result = test.testMajor(c.getVarsta());
		assertTrue(result);
	}
	@Test
	public void testNegativ() {
		Cumparatori c = new Cumparatori("Gigel","Bogdan" , "181822921", -289, null);
		JunitTeste test = new JunitTeste();
		boolean result = test.testMajor(c.getVarsta());
		assertFalse(result);
	}
	@Test
	public void testZero() {
		Cumparatori c = new Cumparatori("Gigel","Bogdan" , "181822921", 0, null);
		JunitTeste test = new JunitTeste();
		boolean result = test.testMajor(c.getVarsta());
		assertFalse(result);
	}
	@Test
	public void testVarstaMaxima() {
		Cumparatori c = new Cumparatori("Gigel","Bogdan" , "181822921", 120, null);
		JunitTeste test = new JunitTeste();
		boolean result = test.testMajor(c.getVarsta());
		assertFalse(result);
	}
}
