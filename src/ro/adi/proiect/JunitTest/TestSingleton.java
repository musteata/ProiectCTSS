package ro.adi.proiect.JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.adi.proiect.Singletton.Proprietar;

public class TestSingleton {

	@Test
	public void testMainFrameSingletonNotNull() {
		Proprietar mf1 = Proprietar.getInstanta();
		assertNotNull(mf1);
	}

	@Test
	public void testSingletonSame() {
		Proprietar firma1 = Proprietar.getInstanta();
		assertSame(Proprietar.getInstanta(), firma1);
	}

	@Test
	public void testSingletonNotNull() {
		Proprietar firma1 = Proprietar.getInstanta();
		assertNotNull(firma1);
	}

	
	@Test
	public void testMainFrameSingletonSame() {
		Proprietar mf1 = Proprietar.getInstanta();
		Proprietar mf2 = Proprietar.getInstanta();
		Proprietar  mf3 = null;
		assertSame(mf1, mf2);
	}
}
