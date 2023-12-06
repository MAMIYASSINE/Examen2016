package Ex2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agence A1= new Agence(100) ;
		Voiture V1=new Voiture("FORD ","Fiesta",2000,11.000) ;
		Voiture V2=new Voiture("KIA","Rio",2012,28.500) ;
		Voiture V3=new Voiture("KIA ","Picanto",2015,26.000) ;
		Voiture V4=new Voiture("OPEL","Astra",2013,45.000) ;
		try
		{
		A1.ajout(V4);
		A1.ajout(V2) ;
		A1.ajout(V3) ;
		A1.ajout(V1) ;
		}
		catch(AjoutInterditException a) {
			System.out.println(a.getMessage());
		}
		finally {
			Critere c1=new CriterePrix(30.900);
			A1.selectionne(c1);
		}
		/*Critere c1=new CriterePrix(30.900);
		A1.selectionne(c1);*/
		
	}

}
