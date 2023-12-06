package Ex2;

public class Voiture {
	
	private String marque ;
	private String modele ;
	private int anneP;
	private double prix;
	public Voiture(String m,String mo , int a, double p)
	{ /* à completer */
		this.marque=m;
		this.modele=mo;
		this.anneP=a;
		this.prix=p;
	}
	public String getMarque(){ return marque ;}
	public String getModele() { return modele;}
	public int getAnne() { return anneP;}
	public double getPrix() { return prix;}
	@Override
	
	public String toString(){
		return "Marque : "+ marque +" Modele : "+ modele +" AnneP :"+anneP+" Prix"+prix;
	}
}
