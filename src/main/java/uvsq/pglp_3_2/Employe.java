package uvsq.pglp_3_2;

public abstract class Employe {
	
	protected double salaire;
	protected double primeAnnee;
	protected int nbrAnnee;

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
