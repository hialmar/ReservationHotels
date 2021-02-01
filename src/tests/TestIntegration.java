package tests;

import controlleurs.ControllerSEnregistrer;
import modeles.SystemeReservation;

public class TestIntegration {
	public static void main(String [] args) {
		SystemeReservation systeme = new SystemeReservation();
		ControllerSEnregistrer controleur = new ControllerSEnregistrer(systeme);
		
		// création ville et catégorie
		controleur.enregistrerHotel("a", "a", 1, "a@a.fr", 2);
		// récupération ville et catégorie existantes
		controleur.enregistrerHotel("b", "a", 1, "b@b.fr", 2);
		// récupération ville existante et création catégorie
		controleur.enregistrerHotel("c", "a", 2, "c@c.fr", 2);
		// création autre ville et autre catégorie
		controleur.enregistrerHotel("c", "b", 2, "c@c.fr", 2);
		// affichages
		System.out.println(controleur);
	}

}
