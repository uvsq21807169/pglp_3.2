package uvsq.pglp_3_2;

public class Vendeur extends Employe{
	
	double commission;
	
	public Vendeur(double comi) {
		commission = comi;
	}

	@Override
	public double calculeSalaire() {
		return salaire + primeAnnee*nbrAnnee + commission;
	}

}
