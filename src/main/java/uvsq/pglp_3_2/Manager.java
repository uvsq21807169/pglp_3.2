package uvsq.pglp_3_2;

public class Manager extends Employe{

	private int nbrPersonneManaginig = 0;
	private double primeParPersonne;
	
	public Manager() {
		primeParPersonne = 100;
	}
	
	public void ajouterUnePersonne() {
		nbrPersonneManaginig++;
	}

	@Override
	public double calculeSalaire() {
		return salaire + primeAnnee*nbrAnnee + nbrPersonneManaginig*primeParPersonne;
	}

}
