package ro.adi.proiect.JunitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SuiteCase.class, TestCNP.class, TestMajor.class,
		TestNume.class, TestPrenume.class, TestPret.class, TestSingleton.class,
		TestVarsta.class })
public class AllTests {

}
