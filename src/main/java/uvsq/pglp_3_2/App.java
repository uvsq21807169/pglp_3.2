package uvsq.pglp_3_2;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Employe v1 = new Vendeur(23);
    	Employe v2 = new Vendeur(57);
    	v2.ajoutAnné();
    	Employe v3 = new Vendeur(8);
    	v3.ajoutAnné();
    	
    	ArrayList<Employe> employes = new ArrayList<Employe>();
    	employes.add(v1);
    	employes.add(v2);
    	employes.add(v3);
    	
    	double salaireTotale = 0;
    	for(Employe emp : employes) {
    		salaireTotale += emp.calculeSalaire();
    	}
    	
    	System.out.println(salaireTotale);
    	
    }
}
