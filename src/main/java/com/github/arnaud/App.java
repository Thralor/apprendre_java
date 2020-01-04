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
    		   		
    	
    	String Men1_Typcpt = "Type du compte [Types possibles : courant, joint, �pargne] : ",
    			Men1_Numcpt = "Num�ro du compte : ",
    			Men1_Cred = "Premi�re valeur cr�dit�e : ",
    			Men1_Taux = "Taux d'�pargne : ",
    			Men1_Typcpt_choix = "",
    			Men1_Numcpt_choix = "",
    			Men1_Cred_choix = "",
    			Men1_Taux_choix = "";
    			
    			
    			
    	
    	String Men2_Numcpt = "Saisissez le N� de compte a consulter : ";
    	
    	String Men3_Msgerr = "option non programm�e";
    	
    	Byte choix = 0;
    	char validation = '\0';
    	
    	
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
    		  while(validation != '\n'&& validation != '\r')
    		  {
    			//Rentre le type de compte
    			System.out.println(Men1_Typcpt);
    			while(validation != '\n'&& validation != '\r') 
    			{
    				validation = (char)System.in.read();
    				if (validation != '\n' && validation != '\r')
    				{
    					Men1_Typcpt_choix = Men1_Typcpt_choix + validation;
    				}
    			}
    			validation = '\0';
    			//Rentre le num�ro de compte
    			System.out.println(Men1_Numcpt);
    			while(validation != '\n'&& validation != '\r') 
    			{
    				validation = (char)System.in.read();
    				if (validation != '\n' && validation != '\r')
    				{
    					Men1_Numcpt_choix = Men1_Numcpt_choix + validation;
    				}
    			}
    			validation = '\0';
    			//Rentre le premier cr�dit
    			System.out.println(Men1_Cred);
    			while(validation != '\n'&& validation !='\r') 
    			{
    				validation = (char)System.in.read();
    				if (validation != '\n' && validation != '\r')
    				{
    					Men1_Cred_choix = Men1_Cred_choix + validation;
    				}
    			}
    			validation = '\0';
    			//Rentre le taux
    			System.out.println(Men1_Taux);
    			while(validation != '\n'&& validation != '\r') 
    			{
    				validation = (char)System.in.read();
    				if (validation != '\n' && validation != '\r')
    				{
    					Men1_Taux_choix = Men1_Taux_choix + validation;
    				}
    			}
    			validation = '\0';
    			//R�cap
    			System.out.println(Men1_Typcpt+Men1_Typcpt_choix);
    	    	System.out.println(Men1_Numcpt+Men1_Numcpt_choix);
    	    	System.out.println(Men1_Cred+Men1_Cred_choix);
    	    	System.out.println(Men1_Taux+Men1_Taux_choix);
    	    	System.out.println(" ");
    	    	System.out.println("Si les informations sont valides appuyez sur entr�e");
    	    	validation = (char)System.in.read();
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
    	    		System.out.println(Crealgn+" : Vous permez de cr�diter ou d�biter un compte d�j� existant");
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
