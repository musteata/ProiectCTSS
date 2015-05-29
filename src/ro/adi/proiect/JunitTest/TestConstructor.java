package ro.adi.proiect.JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.adi.proiect.Observer.Cumparatori;

public class TestConstructor {

	@Test
	public void testConstructor(){
		String nume ="Gigi",
				prenume = "Sise";
		String cnp = "2857332221";
		String telefonMobil ="06556456565565";
		int varsta = 21;
		Cumparatori a = new Cumparatori(nume, prenume,cnp,varsta,telefonMobil);
		assertEquals(a.getCnp(), "2857332221");
		assertEquals(a.getPrenume(), "Sise");
		assertEquals(a.getCnp(), "2857332221");
		assertEquals(a.getVarsta(),21);
		assertEquals(a.getTelefonMObil(), "06556456565565");
		}

}
