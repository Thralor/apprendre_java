
import java.util.*;

public class Cercle {

	public static void main(String[] args) {
		

		double unRayon, lePerimetre ;
		
		Scanner lectureClavier = new Scanner(System.in);
		
		System.out.print("Valeur du rayon : ");

		unRayon = lectureClavier.nextDouble();
		
		lePerimetre = 2* Math.PI*unRayon;
		
		System.out.print("Le Cercle de rayon "+unRayon+ " a pour périmètre "+lePerimetre);
		

	}

}
