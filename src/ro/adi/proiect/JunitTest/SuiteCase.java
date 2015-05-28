package ro.adi.proiect.JunitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCNP.class, TestMajor.class, TestNume.class,
		TestPrenume.class, TestPret.class, TestVarsta.class })
public class SuiteCase {

}
