package modeles;

import java.util.Collection;
import java.util.HashMap;

public class SystemeReservation {

	/**
	 * Liste des villes
	 */
	HashMap<String,Ville> villes = new HashMap<>();
	
	/**
	 * Ajoute une ville
	 * @param ville la ville
	 */
	public void ajouterVille(Ville ville) {
		villes.put(ville.getNom(), ville);
	}
	
	/**
	 * Retourne une ville en fonction de son nom
	 * @param nom le nom de la ville
	 * @return la ville ou null
	 */
	public Ville getVille(String nom) {
		return villes.get(nom);
	}
	
	
	/**
	 * Retourne la liste des villes
	 * @return la liste des villes
	 */
	public Collection<Ville> getVilles() {
		return villes.values();
	}

	/**
	 * Pour l'affichage
	 */
	@Override
	public String toString() {
		return "SystemeReservation [villes=" + villes + "]";
	}
	
	
}
