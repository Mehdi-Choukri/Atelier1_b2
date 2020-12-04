import java.util.Scanner;

public class EXO30 {
	
	/*
	 * Algorithme AlgoExo30

	fonction somme(n : entier) :entier 
		variable s,i :entier 
	debut
		s<-0;
		pour i allant de 1 à n
		debut
		s<-s+i

		finpour
	retourn s
	fin
		
	fonction Factorielle(n : entier) :entier 
		variable f,i :entier 
	debut
		f<-1;
		pour i allant de 1 à n
		debut
		f<-f*i

		finpour
	retourn f
 	fin


	fonction menu ()
		
	variable choix ,nombre : entier

	debut 

	faire

	debut 
	ecrire("Veillez entrer un nombre")
	lire (nombre)
			ecrire("------------Menu------------- ")
			ecrire("|                           |")
			ecrire("| 1)- la factorielle        |")
			ecrire("| 2)- la somme              |")
			ecrire("| 3)- quitter               |")
			ecrire("| votre choix :             |")
			ecrire("|                           |")


	lire(choix)
	si(choix == 1) alors
	ecrire("la factorielle est : "+Factorielle(nombre));
	sinon si (choix ==2) alors
	ecrire("la somme des premiers nombre est : "+Factorielle(nombre));
	sinon ecrire("a bientot")
	fin tantque(choix <> 3)
fin

PP 
Debut 
Menu()
FIN

*/
	
	
	public static void menu()
	{
		int choix = 0;
		int nombre;
		do
		{
			Scanner in = new Scanner(System.in);
			
			System.out.println("-- Veillez entrer un nombre-- ");
			nombre = in.nextInt();
			System.out.println("------------Menu------------- ");
			System.out.println("|                           |");
			System.out.println("| 1)- la factorielle        |");
			System.out.println("| 2)- la somme              |");
			System.out.println("| 3)- quitter               |");
			System.out.println("| votre choix :             |");
			System.out.println("|                           |");
			
			choix = in.nextInt();
			
			if(choix==1)
			{
				System.out.println("la factorielle est : "+factorielle(nombre));
			}
			else if(choix==2)
			{
				System.out.println("la somme des premiers nombre est : "+somme(nombre));
			}
			else
			{
				System.out.println( "A bientot ");
			}
			
			
		}
			
		while(choix != 3);
	}
	public static long factorielle (long N)
	{
		long F=1;
		for(int i=1 ;i<=N;i++)
		{
			F=F*i;
		}
		return F;
	}
	
	public static long fac(long N)
	{
		if(N>=1)
		{
			return N * fac (N-1);
		}
		else
			return 1;
	}
	public static int somme(int N)
	{
		int s=0;
		for(int i=0;i<=N;i++)
		{
			s=s+i;
		}
		return s;
	}
		

	public static void main(String[] args) {
		
		  
		menu();
		

	}

}
