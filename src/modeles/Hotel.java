package modeles;

import java.util.ArrayList;

/**
 * Classe modélisant les hôtels
 * @author torguet
 *
 */
public class Hotel {

	/**
	 * liste des chambres
	 */
	private ArrayList<Chambre> chambres = new ArrayList<>();
	
	/**
	 * ville dans laquelle se trouve l'hôtel
	 */
	private Ville ville;
	
	/**
	 * catégorie de l'hôtel
	 */
	private CategorieDHotel categorie;
	
	/**
	 * nom de l'hôtel
	 */
	private String nom;
	
	/**
	 * email du propriétaire de l'hôtel
	 */
	private String email;

	/**
	 * constructeur
	 * @param nom nom de l'hôtel
	 * @param ville ville dans laquelle se trouve l'hôtel
	 * @param categorie catégorie de l'hôtel
	 * @param email email du propriétaire de l'hôtel
	 */
	public Hotel(String nom, Ville ville, CategorieDHotel categorie, String email) {
		super();
		this.ville = ville;
		this.categorie = categorie;
		this.nom = nom;
		this.email = email;
	}
	
	/**
	 * Ajoute une chambre à l'hôtel
	 * @param chambre la chambre à ajouter
	 */
	public void ajouterChambre(Chambre chambre) {
		this.chambres.add(chambre);
	}
	
	/**
	 * Récupère la ville de cet hôtel
	 * @return la ville actuelle
	 */
	public Ville getVille() {
		return ville;
	}

	/**
	 * Modifie la ville de cet hôtel
	 * @param ville la nouvelle ville
	 */
	public void setVille(Ville ville) {
		this.ville = ville;
	}

	/**
	 * Récupère la catégorie de cet hôtel
	 * @return la catégorie de cet hôtel
	 */
	public CategorieDHotel getCategorie() {
		return categorie;
	}

	/**
	 * Modifie la catégorie de cet hôtel
	 * @param categorie la nouvelle catégorie de cet hôtel
	 */
	public void setCategorie(CategorieDHotel categorie) {
		this.categorie = categorie;
	}

	/**
	 * Récupère le nom de cet hôtel
	 * @return le nom de cet hôtel
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Renomme l'hôtel
	 * @param nom le nouveau nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Récupère l'adresse email de cet hôtel
	 * @return l'email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Modifie l'adresse email de cet hôtel
	 * @param email la nouvelle adresse email de cet hôtel
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Récupère la liste des chambres de cet hôtel
	 * @return la liste des chambres de cet hôtel
	 */
	public ArrayList<Chambre> getChambres() {
		return chambres;
	}
	
	/**
	 * Sert pour l'affichage de l'hôtel
	 */
	@Override
	public String toString() {
		return "Hotel [chambres=" + chambres + ", ville=" + ville + ", categorie=" + categorie + ", nom=" + nom
				+ ", email=" + email + "]";
	}
}
