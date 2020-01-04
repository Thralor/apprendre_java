package com.github.arnaud;
import java.io.IOException;
import java.util.*;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
// Déclaration des variables du menu
    	String Creacpt = "1. Créer un compte", Affcpt = "2. Afficher un compte", Crealgn = "3. Créer une ligne comptable",
    		   Sortir = "4. Sortir", Aide = "5. De l'aide", Choisir = "Veuillez faire votre choix : ";
    		   		
    	
    	String Men1_Typcpt = "Type du compte [Types possibles : courant, joint, épargne] : ",
    			Men1_Numcpt = "Numéro du compte : ",
    			Men1_Cred = "Première valeur créditée : ",
    			Men1_Taux = "Taux d'épargne : ",
    			Men1_Typcpt_choix = "",
    			Men1_Numcpt_choix = "",
    			Men1_Cred_choix = "",
    			Men1_Taux_choix = "";
    			
    			
    			
    	
    	String Men2_Numcpt = "Saisissez le N° de compte a consulter : ";
    	
    	String Men3_Msgerr = "option non programmée";
    	
    	Byte choix = 0;
    	char validation = '\0';
    	
    	
    	Scanner Lectureclavier = new Scanner(System.in);
 //Boucle principale
    do
    {
 // Réinitialisation
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
    			//Rentre le numéro de compte
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
    			//Rentre le premier crédit
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
    			//Récap
    			System.out.println(Men1_Typcpt+Men1_Typcpt_choix);
    	    	System.out.println(Men1_Numcpt+Men1_Numcpt_choix);
    	    	System.out.println(Men1_Cred+Men1_Cred_choix);
    	    	System.out.println(Men1_Taux+Men1_Taux_choix);
    	    	System.out.println(" ");
    	    	System.out.println("Si les informations sont valides appuyez sur entrée");
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
    				System.out.println("Appuyez sur entrée pour revenir au menu principal");
    				validation = (char) System.in.read();
    			}
	    		
	    	break;
    		case 4:
    			System.exit(0);
    		break;
    		case 5:
    			while(validation != '\n' && validation != '\r') 
    			{
    				System.out.println(Creacpt+ " : Vous permez de créer un compte avec un premier crédit à un taux choisi");
    	    		System.out.println(Affcpt+" : Vous permez d'obtenir les informations d'un compte précis");
    	    		System.out.println(Crealgn+" : Vous permez de créditer ou débiter un compte déjà existant");
    	    		System.out.println(Sortir+" : Vous permez de sortir");
    	    		System.out.println("Appuyez sur entrée pour revenir au menu principal");
    	    		validation = (char) System.in.read();
    			}
    		break;
    		default:
    			System.out.println("Menu non existant, veuillez réessayer");
    			    		
    	}
    	
    }while(choix != 4);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
