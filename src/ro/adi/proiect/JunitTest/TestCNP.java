package ro.adi.proiect.JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.adi.proiect.Observer.Cumparatori;
import ro.adi.proiect.Singletton.Proprietar;

public class TestCNP {

	@Test
	public void testSex() {
Cumparatori cumparator = new Cumparatori("VLAD", "MIHAI", "1210467891111", 40, null);
JunitTeste  test = new JunitTeste();
String sex ="";
sex=test.testCnp(cumparator);
assertEquals("barbat", sex);
	}
	
	@Test
	public void testCnpNULL() {

		Cumparatori c = new Cumparatori("0", "Bogdan" , "181822921", 42, null);
		JunitTeste test = new JunitTeste();
		String result=test.testCnp(c);
		assertEquals(null, result);
			}
	@Test
	public void testBoolDupa200(){
		String nume ="Maria",
				prenume = "Prichici";
		String cnp = "2857332221";
		int varsta = 10;
		Cumparatori a = new Cumparatori(nume, prenume, cnp, varsta, cnp );				
		assertFalse(a.CnpValidDupa2000());
		a.setCnp("53332");
//		assertTrue(a.CnpValidDupa2000());
		}

	@Test
	public void TelefonMobilPrimele(){
		String nume ="Sergiu";
		String prenume = "Stefan";
		String cnp = "2857332221";
		String telefonMobil = "06556456565565";	
		int varsta = 21;
		Cumparatori a = new Cumparatori(nume, prenume,null,varsta,telefonMobil);
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
		Cumparatori a = new Cumparatori(nume, prenume,null,varsta,telefonMobil);
		assertFalse(a.Telefonvalids());
		a.setTelefonMObil("0749605208");
		assertTrue(a.Telefonvalids());
		}
	@Test
	public void CnpValidd(){
		String nume ="Musteata";
		String prenume = "Adrian";
		String cnp = "1234567892";
		String telefonMobil = "06556456565565";	
		int varsta = 21;
		Cumparatori a = new Cumparatori(nume, prenume,null,varsta,telefonMobil);
		//assertFalse(a.CnpValid());
		a.setCnp("1234567891234");
	//	assertTrue(a.CnpValid());
		}
	@Test
	public void testConstructor(){
		String nume ="Gigi",
				prenume = "Sise";
		String cnp = "2857332221";
		String telefonMobil ="06556456565565";
		int varsta = 21;
		Cumparatori a = new Cumparatori(nume, prenume,cnp,varsta,telefonMobil);
		assertEquals(a.getCnp(), "2857332221");
		//assertEquals(a.getPrenume(), "Prichici");
		}

	

}


