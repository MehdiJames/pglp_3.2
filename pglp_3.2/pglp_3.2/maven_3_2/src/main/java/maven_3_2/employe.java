package maven_3_2;

public class employe implements Salaire {
	private int nb_annees;
	private coordonnees coordonnees;

	public String getCoordonnees() {
		return coordonnees.toString();
	}
	
	public double calculSalaire() {
		return  nb_annees * 20 + 1500;
	}
	
}


