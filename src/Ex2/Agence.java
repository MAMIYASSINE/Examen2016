package Ex2;

public class Agence {
	public Voiture tabv[];
	public String ref;
	public int taille;
	public int nbrvoiture;
	public Agence(int taille)
	{
		this.taille=taille;
		tabv=new Voiture[taille];
	}
	public void  selectionne(Critere c) {
		for(int i=0;i<nbrvoiture;i++) {
			if(c.correspond(tabv[i])) {
				System.out.println(tabv[i]);
			}
		}
	}
	public void ajout(Voiture v) throws AjoutInterditException {
		if(nbrvoiture<taille) {
			if(v.getAnne()<=2010) {
				throw new AjoutInterditException("Impossible d'ajouter une voiture qui depasse 5 ans");
			}
			else
			{
				tabv[nbrvoiture]=v;
				nbrvoiture++;
			}
		}
		else
		{
			System.out.print("Le tableau est plein");
		}
	}
	

}
