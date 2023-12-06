package Ex2;

public class CriterePrix implements Critere {

	
	private double prixfixe;
	CriterePrix(double p){
		this.prixfixe=p;
	}
	
	@Override
	public boolean correspond(Object v) {
		if(v instanceof Voiture) {
			if(((Voiture)v).getPrix()<this.prixfixe)
			{
				return true ;
			}
			else
			{
				return false;
			}
		// TODO Auto-generated method stub
	
		}
		else {
			return false;
		}
	}
	

}
