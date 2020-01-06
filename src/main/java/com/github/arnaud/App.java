package com.github.arnaud;
import java.io.IOException;
import java.util.*;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
// D�claration des variables du menu
    	String Creacpt = "1. Cr�er un compte", Affcpt = "2. Afficher un compte", Crealgn = "3. Cr�er une ligne comptable",
    		   Sortir = "4. Sortir", Aide = "5. De l'aide", Choisir = "Veuillez faire votre choix : ";
    		   		
    	
    	String Men1_Typcpt = "Type du compte [Types possibles : courant, joint, epargne] : ",
    			Men1_Numcpt = "Num�ro du compte : ",
    			Men1_Cred = "Premi�re valeur cr�dit�e : ",
    			Men1_Taux = "Taux d'�pargne : ";
    	char	Men1_Typcpt_choix = '\0';
    	int     Men1_Numcpt_choix = 0;
    	double  Men1_Cred_choix = 0,
    			Men1_Taux_choix = 0;
    	
    			
    			
    			
    	
    	String Men2_Numcpt = "Saisissez le N� de compte a consulter : ";
    	
    	String Men3_Msgerr = "option non programm�e";
    	
    	Byte choix = 0;
    	char validation = 'n',
    		 confirmation = 'K';
    	
    	
    	Scanner Lectureclavier = new Scanner(System.in);
 //Boucle principale
    do
    {
 // R�initialisation
    	validation = '\0';
    	choix = 0;
 // Affichage du Menu princiapl
    	System.out.println(Creacpt);
    	System.out.println(Affcpt);
    	System.out.println(Crealgn);
    	System.out.println(Sortir);
    	System.out.println(Aide);
    	System.out.println(Choisir);
    	
 // Attent le choix de l'utlisateur
    	choix = Lectureclavier.nextByte();
    	
 // Selon le choix on va dans le menu correspondant
    	
    	switch (choix)
    	{
    		case 1:
    		while(confirmation == 'K')
    		{
    		  while(validation != 'o')
    		  {
    			//Rentre le type de compte
    			System.out.println(Men1_Typcpt);
    			Men1_Typcpt_choix = Lectureclavier.next().charAt(0);
    			if (Men1_Typcpt_choix == 'c' || Men1_Typcpt_choix == 'j' || Men1_Typcpt_choix == 'e' )
    			{
    					validation = 'o';
    			}
				else
				{
					System.out.println("Choisissez entre courant(c)/joint(j)/epargne(e)");	
				}
    			
    		  }
    			validation = 'n';
    			
    			
    			//Rentre le num�ro de compte
    			System.out.println(Men1_Numcpt);
    			while(validation != 'o') 
    			{
    				Men1_Numcpt_choix = Lectureclavier.nextInt();
    				if (Men1_Numcpt_choix > 0)
    					validation = 'o';
    				else
    					System.out.println("Entrez un num�ro de compte positif � 12 chiffres");	

    			}
    			validation = 'n';
    			
    			//Rentre le premier cr�dit
    			System.out.println(Men1_Cred);
    			while(validation != 'o') 
    			{
    				Men1_Cred_choix = Lectureclavier.nextInt();
    				if (Men1_Cred_choix > 0)
    					validation = 'o';
    				else
    					System.out.println("Entrez une valeur positive");	

    			}
    			validation = 'n';
    			
    			//Rentre le taux
    			System.out.println(Men1_Taux);
    			while(validation != 'o') 
    			{
    				Men1_Taux_choix = Lectureclavier.nextInt();
    				if (Men1_Taux_choix > 0 && Men1_Taux_choix <10)
    					validation = 'o';
    				else
    					System.out.println("Choisissez un taux entre 0 et 10%");	

    			}
    			validation = 'n';
    			
    			//R�cap
    			System.out.println(Men1_Typcpt+Men1_Typcpt_choix);
    	    	System.out.println(Men1_Numcpt+Men1_Numcpt_choix);
    	    	System.out.println(Men1_Cred+Men1_Cred_choix);
    	    	System.out.println(Men1_Taux+Men1_Taux_choix);
    	    	System.out.println(" ");
    	    	System.out.println("Si les informations sont valides �crivez O, sinon K");
    	    	confirmation = Lectureclavier.next().charAt(0);
    	}
 
    		  
    			
  
    		break;
    		case 2:
    			System.out.println(Men2_Numcpt);
    		
    		break;
    		case 3:
    			while(validation != '\n'&& validation != '\r') 
    			{
    				System.out.println(Men3_Msgerr);
    				System.out.println("Appuyez sur entr�e pour revenir au menu principal");
    				validation = (char) System.in.read();
    			}
	    		
	    	break;
    		case 4:
    			System.exit(0);
    		break;
    		case 5:
    			while(validation != '\n' && validation != '\r') 
    			{
    				System.out.println(Creacpt+ " : Vous permez de cr�er un compte avec un premier cr�dit � un taux choisi");
    	    		System.out.println(Affcpt+" : Vous permez d'obtenir les informations d'un compte pr�cis");
    	    		System.out.println(Crealgn+" 5: Vous permez de cr�diter ou d�biter un compte d�j� existant");
    	    		System.out.println(Sortir+" : Vous permez de sortir");
    	    		System.out.println("Appuyez sur entr�e pour revenir au menu principal");
    	    		validation = (char) System.in.read();
    			}
    		break;
    		default:
    			System.out.println("Menu non existant, veuillez r�essayer");
    			    		
    	}
    	
    }while(choix != 4);
    

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
