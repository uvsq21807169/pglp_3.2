package uvsq.pglp_3_2;

public abstract class Employe {
	
	double salaire;
	double primeAnnee;
	int nbrAnnee;

	public Employe() {
		salaire = 1500;
		primeAnnee = 20;
		nbrAnnee = 0;
	}
	
	public void ajoutAnné() {
		nbrAnnee++;
	}
	
	public abstract double calculeSalaire();

}
