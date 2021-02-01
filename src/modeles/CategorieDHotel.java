package modeles;

import java.util.Collection;
import java.util.HashMap;

/**
 * Classe qui modélise les catégories d'hôtels (nombre d'étoiles)
 * @author torguet
 *
 */
public class CategorieDHotel {
	
	/**
	 * le nombre d'étoiles
	 */
	private int nombreDEtoiles;
	
	/**
	 * Liste des hôtels de cette catégorie
	 */
	private HashMap<String,Hotel> hotels = new HashMap<>();

	/**
	 * Constructeur
	 * @param nombreDEtoiles le nombre d'étoile
	 */
	public CategorieDHotel(int nombreDEtoiles) {
		super();
		this.nombreDEtoiles = nombreDEtoiles;
	}
	
	/**
	 * Retourne la liste des hôtels
	 * @return la liste des hôtels
	 */
	public Collection<Hotel> getHotels() {
		return hotels.values();
	}

	/**
	 * Retourne le nombre d'étoiles de la catégorie
	 * @return le nombre d'étoiles de la catégorie
	 */
	public int getNombreDEtoiles() {
		return nombreDEtoiles;
	}

	/**
	 * ajoute un hôtel à la catégorie
	 * @param hotel l'hôtel à ajouter
	 */
	public void ajouterHotel(Hotel hotel) {
		hotels.put(hotel.getNom(),hotel);
	}
	
	/**
	 * Cherche un Hôtel en précisant son nom (on suppose qu'ils sont tous différents)
	 * @param nom nom de l'hôtel
	 * @return l'hôtel ou null
	 */
	public Hotel getHotel(String nom) {
		return hotels.get(nom);
	}

	/**
	 * Sert pour afficher la catégorie.
	 */
	@Override
	public String toString() {
		return "CategorieDHotel [nombreDEtoiles=" + nombreDEtoiles + "]";
	}
	
	
	
}
