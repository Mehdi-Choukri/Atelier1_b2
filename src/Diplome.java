
public class Diplome {
	
	private String titre ;
	private String mention;
	private int anobtenu ;
	
	public void setTitre(String t)
	{
		if(!t.isEmpty())
		{
			this.titre = t;
		}
	}
	public String getTitre()
	{
		return this.titre;
	}
	
	public void setMention(String m)
	{
		if(!m.isEmpty())
		{
			this.mention = m;
		}
	}
	public String getMention()
	{
		return this.mention;
	}
	
	public void setAnobtenu(int A)
	{
		if(A >1940)
		{
			this.anobtenu = A;
		}
	}
	public int getAnobtenu()
	{
		return this.anobtenu;
	}
	
	public Diplome (){}
	
	public Diplome(String T, String M, int A)
	{
		setTitre(T);
		setMention(M);
		setAnobtenu(A);
		
	}
	public String toString()
	{
		return "Votre Diplome est : '"+getTitre()+"' et vous l'avez pris avec une mention : '"+getMention()+"' en "+getAnobtenu();
	}
	
	public static void main(String[] args) {
		 
		Diplome D = new Diplome("TOFL","Bien",2018);
		System.out.println(D.toString());

	}

}
