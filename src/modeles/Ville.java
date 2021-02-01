package modeles;

import java.util.Collection;
import java.util.HashMap;

/**
 * Classe qui modélise les villes
 * @author torguet
 *
 */
public class Ville {
	
	/**
	 * nom de la ville
	 */
	private String nom;
	
	/**
	 * catégories d'hôtels
	 */
	private HashMap<Integer,CategorieDHotel> categories = new HashMap<>();

	/**
	 * constructeur
	 * @param nom le nom de la ville
	 */
	public Ville(String nom) {
		super();
		this.nom = nom;
	}
	
	/**
	 * Retourne le nom de la ville
	 * @return le nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Modifie le nom de la ville
	 * @param nom le nouveau nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	/**
	 * Retourne la liste des catégories d'hôtels
	 * @return la liste des catégories
	 */
	public Collection<CategorieDHotel> getCategories() {
		return categories.values();
	}

	/**
	 * Ajoute une catégorie d'hôtels
	 * @param categorie la catégorie
	 */
	public void ajouterCategorie(CategorieDHotel categorie) {
		this.categories.put(categorie.getNombreDEtoiles(), categorie);
	}
	
	/**
	 * Retourne la catégorie d'hôtel en fonction du nombre d'étoiles
	 * @param nombreDEtoiles le nombre d'étoiles
	 * @return la catégorie ou null
	 */
	public CategorieDHotel getCategorie(int nombreDEtoiles) {
		return this.categories.get(nombreDEtoiles);
	}

	/**
	 * Sert pour afficher la ville
	 */
	@Override
	public String toString() {
		return "Ville [nom=" + nom + "]";
	}

}
