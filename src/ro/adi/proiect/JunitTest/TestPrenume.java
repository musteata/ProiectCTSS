package ro.adi.proiect.JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.adi.proiect.Observer.Cumparatori;

public class TestPrenume {

	@Test
	public void testNumere() {

		Cumparatori c = new Cumparatori("Adi","123" , "181822921", 42, null);
		JunitTeste test = new JunitTeste();
		boolean result=test.testPrenume(c.getPrenume());
		assertFalse(result);
			}
	
	@Test
	public void testLitere() {

		Cumparatori c = new Cumparatori("ana", "Bogdan" , "181822921", 42, null);
		JunitTeste test = new JunitTeste();
		boolean result=test.testPrenume(c.getPrenume());
		assertTrue(result);
			}
	@Test
	public void testStringGol() {

		Cumparatori c = new Cumparatori("Adi", "" , "181822921", 42, null);
		JunitTeste test = new JunitTeste();
		boolean result=test.testPrenume(c.getPrenume());
		assertFalse(result);
			}
	
	@Test
	public void testPrenumeNull() {

		Cumparatori c = new Cumparatori("Adi", null , "181822921", 42, null);
		JunitTeste test = new JunitTeste();
		boolean result=test.testPrenume(c.getPrenume());
		assertFalse(result);
			}
	}


