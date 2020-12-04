
public class Chien {
	
	public String nom ;
	
	public Chien(String n)
	{
		SetNom(n);
		
	}
	
	public void SetNom(String N)
	{
		if(!N.isEmpty())
		{
			this.nom = N;
		}
	}
	public String getNom()
	{
		return this.nom;
	}
	public String aboyer(String sens)
	{
		return sens;
		
	}
	public   String manger(String qlqc)
	{
		return "Je mange "+qlqc;
	}
	
	 
	

	public static void main(String[] args) {
	 
		Chien c = new Chien("Rex");
		
		String chaine_manger = "de la viande";
		String chaine_aboyer ="Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF  WWWWOARF !!";
		System.out.println(c.aboyer(chaine_aboyer));
		System.out.println(c.manger(chaine_manger ));		
		
		
		
		
		

	}

}
