package maven_3_2;

public class manager extends employe {

private int nbEmploye;
	
	@Override
	public double calculSalaire() {
		return super.calculSalaire() + nbEmploye * 100;
	}
	
}
