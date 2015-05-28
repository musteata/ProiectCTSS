package ro.adi.proiect.JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.adi.proiect.Observer.Cumparatori;

public class TestVarsta {

	@Test
	public void test() {
Cumparatori c = new Cumparatori("Gigel","Bogdan" , "181822921", 42, null);
JunitTeste test = new JunitTeste();
int result=test.testSetter(c, 50);
assertEquals(c.getVarsta(), result);

	}
	

}