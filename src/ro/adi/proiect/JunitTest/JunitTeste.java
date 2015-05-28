package ro.adi.proiect.JunitTest;

import java.util.regex.Pattern;

import ro.adi.proiect.Observer.Cumparatori;

public class JunitTeste {

	public int testSetter (Cumparatori c,int varsta)
	{
		c.setVarsta(varsta);
		return varsta;
		
	}
	
	
	public boolean testMajor(int varsta)
	{
		boolean major = false;
				if(varsta == 0)
					return false;
			if(varsta<0)
			return false;
			if(varsta>105)
				return false;
				if(varsta>18)
					major = true;
				return major;
	}
	
	
	public String testCnp (Cumparatori c)
	{
		
 String sex = c.getCnp().valueOf(c.getCnp().charAt(0));
	    
 String s = "";
		if(c.getCnp().length() == 0)
		{System.out.println("CNP = 0");
		return null;
		}
	if(c.getCnp().length()<0){
	System.out.println("CNP < 0");
	return null;
	}
		if(c.getCnp().length()>13){
			System.out.println("CNP > 13");
			return null;
		}
		if(c.getCnp().length()==13)
		{	
		if(Integer.parseInt(sex)==1)
		{
			s="barbat";
			System.out.println("Sexul cumparatorul : barbat");	
			return s;
		}
		else if(Integer.parseInt(sex)==2)
			System.out.println("Sexul cumparatorului : femeie");
		s="femeie";
		return s;
		}
		else if(Integer.parseInt(sex)>2||Integer.parseInt(sex)<1)
			System.out.println("CNP INVALID");
		return null;
	    
	}
	
	public boolean testPret(double pret)
	{
	
		if(pret<0)
			return false;
		else if(pret == 0)
			return false;
		else if(pret>9999)
			return false;
		else return true;
		
	}
	
	
	public boolean testNume( String nume)
	{
		boolean m = false;
		
		if(nume =="")
			return false;
		else if(nume==null)
				return false;
		else if(nume.matches("[a-zA-Z]+")== true)
		{
			return true;
		}
		else if(nume.length()>12)
			return false;
		else
			return m;
		
	}
	
	public boolean testPrenume( String prenume)
	{
		boolean p = false;
		
		if(prenume =="")
			return false;
		else if(prenume==null)
				return false;
		else if(prenume.matches("[a-zA-Z]+")== true)
		{
			return true;
		}
		else if(prenume.length()>12)
			return false;
		else
			return p;
		
	}
}


