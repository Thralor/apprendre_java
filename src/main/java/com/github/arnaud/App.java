package com.github.arnaud;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	//Déclaration variables
    	int nbCB = 0, nbCheque = 0, nbVirement = 0, nbDebit = 0;
    	double prctCB = 0, prctCh = 0, prctVi = 0;
    	
    	Scanner lectureClavier = new Scanner(System.in);
    	
    	//Demande les informations
    	System.out.print(" Nombre de paiement par CB :");
    	nbCB = lectureClavier.nextInt();
    	
    	System.out.print(" Nombre de paiement par Chèque :");
    	nbCheque = lectureClavier.nextInt();
    	
    	System.out.print(" Nombre de paiement par Virement :");
    	nbVirement = lectureClavier.nextInt();
    	
    	//Effectue les calculs
    	nbDebit = nbCB+nbCheque+nbVirement;
    	prctCB = (double) nbCB/(nbDebit) * 100;
    	prctCh = (double) nbCheque/(nbDebit) * 100;
    	prctVi = (double) nbVirement/(nbDebit) * 100;
    	
    	//Affiche les resultats
    	System.out.println("Vous avez émis "+nbDebit+ " débit(s) dont : ");
    	System.out.println(prctCB+"% par Carte bleu");
    	System.out.println(prctCh+"% par Chèque(s)");
    	System.out.println(prctVi+"% par Virement(s)");
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
