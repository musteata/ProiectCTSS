package ro.adi.proiect.JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.adi.proiect.Factory.AnimalObject;

public class TestPret {

	@Test
	public void testZero() {
		AnimalObject c = new AnimalObject("Mov cu pete",21,0);
		JunitTeste test = new JunitTeste();
		boolean result = test.testPret(c.getPret());
		assertFalse(result);
	}
	@Test
	public void testNegative() {
		AnimalObject c = new AnimalObject("Mov cu pete",21,-10);
		JunitTeste test = new JunitTeste();
		boolean result = test.testPret(c.getPret());
		assertFalse(result);
	}
	@Test
	public void testAberant() {
		AnimalObject c = new AnimalObject("Mov cu pete",21,9999999);
		JunitTeste test = new JunitTeste();
		boolean result = test.testPret(c.getPret());
		assertFalse(result);
	}
	@Test
	public void testNormal() {
		AnimalObject c = new AnimalObject("Mov cu pete",21,100);
		JunitTeste test = new JunitTeste();
		boolean result = test.testPret(c.getPret());
		assertTrue(result);
	}
	

}
