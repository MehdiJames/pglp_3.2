package maven_3_2;

import java.util.ArrayList;
import java.util.List;

public class entreprise {

	private List<Salaire> salaireList;
	
	public entreprise() {
		salaireList = new ArrayList<Salaire>();
	}
	
	public double getSommeTotaleSalaires() {
		double sum = 0;
		for (Salaire s : salaireList) {
			sum += s.calculSalaire();
		}
		return sum;
	}
}