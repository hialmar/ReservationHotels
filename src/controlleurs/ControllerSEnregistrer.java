package controlleurs;

import modeles.CategorieDHotel;
import modeles.Chambre;
import modeles.Hotel;
import modeles.SystemeReservation;
import modeles.Ville;

/**
 * Le controlleur qui permet d'enregistrer un hôtel
 * @author torguet
 *
 */
public class ControllerSEnregistrer {

	/**
	 * Le système de réservation
	 */
	private SystemeReservation systeme;
	
	
	/**
	 * Constructeur
	 * @param systeme le système de réservation
	 */
	public ControllerSEnregistrer(SystemeReservation systeme) {
		super();
		this.systeme = systeme;
	}

	/**
	 * Enregistre un nouvel hôtel
	 * @param nom le nom de l'hôtel
	 * @param nomVille le nom de la ville
	 * @param nbEtoiles le nombre d'étoiles
	 * @param email l'email de l'hôtelier
	 * @param nbChambres le nombre de chambres de l'hôtel
	 */
	public void enregistrerHotel(String nom, String nomVille, int nbEtoiles, String email, int nbChambres) {
		// tente de récupérer la ville
		Ville ville = systeme.getVille(nomVille);
		
		// si elle n'existe pas
		if(ville == null) {
			// on la crée
			ville = new Ville(nomVille);
			// on l'ajoute
			systeme.ajouterVille(ville);
		}
		
		// tente de récupérer la catégorie
		CategorieDHotel categorie = ville.getCategorie(nbEtoiles);
		
		// si elle n'existe pas
		if(categorie == null) {
			// on la crée
			categorie = new CategorieDHotel(nbEtoiles);
			// on l'ajoute
			ville.ajouterCategorie(categorie);
		}
		
		// on crée l'hôtel
		Hotel hotel = new Hotel(nom, ville, categorie, email);
		
		// on l'ajoute
		categorie.ajouterHotel(hotel);
		
		// on ajoute les chambres
		for(int i=0; i<nbChambres; i++) {
			// on crée une chambre
			Chambre chambre = new Chambre();
			// on l'ajoute
			hotel.ajouterChambre(chambre);
		}
	}

	/**
	 * Sert pour l'affichage
	 */
	@Override
	public String toString() {
		// nouvelle chaîne
		String affichage = "";
		// parcourt les villes
		for(Ville ville : systeme.getVilles()) {
			affichage += ville + "\n";
			// parcourt les catégories
			for(CategorieDHotel categorie : ville.getCategories()) {
				affichage += categorie + "\n";
				// parcourt les hôtels
				for(Hotel hotel : categorie.getHotels()) {
					affichage += hotel + "\n";
				}
			}
		}
		// renvoie la chaîne calculée
		return affichage;
	}
	
	
	
}
