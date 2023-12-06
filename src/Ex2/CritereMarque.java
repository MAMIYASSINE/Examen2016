package Ex2;

public class CritereMarque implements Critere {

	private String marquedonne;
	CritereMarque(String marq){
		this.marquedonne=marq;
	}
	@Override
	public boolean correspond(Object v) {
		// TODO Auto-generated method stub
		if(v instanceof Voiture) {
			if(((Voiture)v).getMarque().equals(marquedonne))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else {
			return false;
		}
	}

}
