
public class Institut extends Etablissement {

	private String Filiere ;
	
	public void SetFiliere(String F)
	{
		if(!F.isEmpty())
		
		this.Filiere=F;
	}
	public String getFiliere()
	{
		return this.Filiere;
	}
	 
	public Institut (String Nom ,String F)
	{
		super(Nom);
		 SetFiliere(F);
	}
	 
	public Institut (String Nom ,int nbE,String F)
	{
		super(Nom,nbE);
		SetFiliere(F);
		
	}
	public String toString()
	{
		return "L'institut est "+this.getNom()+" ça filiere est  "+getFiliere()+" et il contient "+this.getNbEtudiant()+" etudiants ";
	}
	
	 
	
	public static void main(String[] args) {
		
		Institut I = new Institut("Youcode",90,"Informatique");
		
		System.out.println(I.toString());
		
		 

	}

}
