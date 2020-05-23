package maven_3_2;

public class vendeur extends employe {

private double com;
	
	@Override
	public double calculSalaire(){
		return  com + super.calculSalaire();
	}
}
