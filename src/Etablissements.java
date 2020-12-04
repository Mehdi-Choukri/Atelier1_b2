
public class Etablissements {
	private String nom ;
	private int nbEtudiant ;
	
	 public Etablissements()
	 {
		 
	 }
	 public Etablissements(String Nom ,int nbE)
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
		return "Le nom de l'etablissement : "+ this.getNom() +" Il contient "+this.getNbEtudiant()+"Etudiants";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
