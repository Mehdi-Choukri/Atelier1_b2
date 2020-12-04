
public class Etablissement {
	
	private String nom ;
	private int nbEtudiant ;
	
	 public Etablissement()
	 {
		 
	 }
	 public Etablissement(String Nom)
	 {
		 setNom(Nom);
	 }
	 public Etablissement(String Nom ,int nbE)
	 {
		 setNom(Nom);
		 setNbEtudiant(nbE);
	 }

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if(nom !="")
		this.nom = nom;
	}

	public int getNbEtudiant() {
		return nbEtudiant;
	}

	public void setNbEtudiant(int nbEtudiant) {
		if(nbEtudiant > 0 )
		this.nbEtudiant = nbEtudiant;
	}
	public String toString()
	{
		return "Le nom de l'etablissement est : "+ this.getNom() +" et Il contient "+this.getNbEtudiant()+" Etudiants";
	}
	
	public static void main(String[] args) {
		 
		Etablissement E = new Etablissement("Youcode",90);
		
		System.out.println(E.toString());
		

	}

}
