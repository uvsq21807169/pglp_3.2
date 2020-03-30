package uvsq.pglp_3_2;


import static org.junit.Assert.*;

import java.util.ArrayList;


public class AppTest {
	
	@org.junit.Test
	public void testVendeur(){

		Vendeur v1 = new Vendeur(23);
    	ArrayList<Employe> employes = new ArrayList<Employe>();
    	employes.add(v1);
    	double salaireTotale = 0;
    	for(Employe emp : employes) {
    		salaireTotale += emp.calculeSalaire();
    	}
    	assertEquals(salaireTotale, 1523, 0.1);
		
	}
	
	@org.junit.Test
	public void testVendeurAvecAnciente(){

		Vendeur v1 = new Vendeur(23);
		v1.ajoutAnné();
    	ArrayList<Employe> employes = new ArrayList<Employe>();
    	employes.add(v1);
    	double salaireTotale = 0;
    	for(Employe emp : employes) {
    		salaireTotale += emp.calculeSalaire();
    	}
    	assertEquals(salaireTotale, 1543, 0.1);
		
	}
	
	@org.junit.Test
	public void testPlusieursVendeur(){

		Vendeur v1 = new Vendeur(23);
		Vendeur v2 = new Vendeur(0);
    	v2.ajoutAnné();
    	
    	ArrayList<Employe> employes = new ArrayList<Employe>();
    	employes.add(v1);
    	employes.add(v2);
    	double salaireTotale = 0;
    	for(Employe emp : employes) {
    		salaireTotale += emp.calculeSalaire();
    	}
    	assertEquals(salaireTotale, 3043, 0.1);
		
	}
	
	
	@org.junit.Test
	public void testAjoutManager(){

		Vendeur v1 = new Vendeur(23);
		Vendeur v2 = new Vendeur(0);
    	v2.ajoutAnné();
    	
    	Manager m1 = new Manager();
    	m1.ajouterUnePersonne();
    	m1.ajouterUnePersonne();    	
    	
    	ArrayList<Employe> employes = new ArrayList<Employe>();
    	employes.add(v1);
    	employes.add(v2);
    	employes.add(m1);
    	
    	double salaireTotale = 0;
    	for(Employe emp : employes) {
    		salaireTotale += emp.calculeSalaire();
    	}
    	assertEquals(salaireTotale, 4743, 0.1);
		
	}
	
}
