package ro.adi.proiect.JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.adi.proiect.Observer.Cumparatori;

public class TestNrTelefon {

	@Test
	public void TelefonMobilPrimele(){
		String nume ="Sergiu";
		String prenume = "Stefan";
		String cnp = "2857332221";
		String telefonMobil = "06556456565565";	
		int varsta = 21;
		Cumparatori a = new Cumparatori(nume, prenume,cnp,varsta,telefonMobil);
		assertFalse(a.TelefonMobil());
		a.setTelefonMObil("07");
	//	assertTrue(a.tele());
		}
	
	@Test
	public void Telefonvalids(){
		String nume ="Sergiu";
		String prenume = "Stefan";
		String cnp = "2857332221";
		String telefonMobil = "06556456565565";	
		int varsta = 21;
		Cumparatori a = new Cumparatori(nume, prenume,cnp,varsta,telefonMobil);
		assertFalse(a.Telefonvalids());
		a.setTelefonMObil("0749605208");
		assertTrue(a.Telefonvalids());
		}

}
