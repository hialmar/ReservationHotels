package vue;

import java.util.Scanner;

import controlleurs.ControllerSEnregistrer;

/**
 * Boundary pour le cas s'enregistrer
 * @author torguet
 *
 */
public class BoundarySEnregistrer {
	
	/**
	 * le contrôleur
	 */
	private ControllerSEnregistrer controleur;
	
	/**
	 * scanner pour lire les données
	 */
	private Scanner scanner;

	/**
	 * Constructeur
	 * @param controleur le contrôleur de ce cas
	 * @param scanner un scanner pour lire les données
	 */
	public BoundarySEnregistrer(ControllerSEnregistrer controleur, Scanner scanner) {
		super();
		this.controleur = controleur;
		this.scanner = scanner;
	}
	
	public void enregistrerHotel() {
		System.out.println("Quel est le nom de l'hôtel ?");
		String nom = scanner.nextLine();
		System.out.println("Quel est le nom de la ville ?");
		String nomVille = scanner.nextLine();
		System.out.println("Quel est le nombre d'étoiles ?");
		int nbEtoiles = scanner.nextInt();
		scanner.nextLine(); // ne pas oublier de sauter le retour à la ligne
		System.out.println("Quelle est l'adresse e-mail ?");
		String email = scanner.nextLine();
		System.out.println("Quel est le nombre de chambres ?");
		int nbChambres = scanner.nextInt();
		scanner.nextLine(); // ne pas oublier de sauter le retour à la ligne
		controleur.enregistrerHotel(nom, nomVille, nbEtoiles, email, nbChambres);
	}

	@Override
	public String toString() {
		return "BoundarySEnregistrer [controleur=" + controleur + "]";
	}
	
	
}
