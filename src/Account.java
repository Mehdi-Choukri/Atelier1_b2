
public class Account {
	
	private String nom ;
	private String  adresse;
	private double solde;
	
	public Account(String n , String a, double s)
	{
		setNom(n);
		setAdresse(a);
		setSolde(s);
		
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		if(!nom.isEmpty())
		this.nom = nom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		if(!adresse.isEmpty())
		this.adresse = adresse;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		if(solde>0)
		this.solde = solde;
	}
	
	public String toString()
	{
		return this.getNom()+" habite à "+this.getAdresse()+" - info solde "+this.getSolde()+" DH";
	}
	public double calculerInterer(double tauxInteret) 
	{
		double interet ;
		interet = getSolde()*tauxInteret/100;
		return interet;
	}
	public void retirer(double m)
	{
		if(m>0 && ((getSolde()-m)>=0))
		{
			setSolde(getSolde()-m);
		}
	}

	

	public static void main(String[] args) {
		
		Account A = new Account("Mohamed elmehdi choukri","Safi",1334);
		
		System.out.println(A.toString());
		
		A.retirer(1000);
		System.out.println(A.toString());
	 
		
	 

	}

}
