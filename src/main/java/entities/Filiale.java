package entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filiale")
public class Filiale {
	@Id
	@Column(name = "nom")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private String nom;
	@ManyToOne
	@JoinColumn(name = "societe_nom")
	private Entreprise entreprise;

	@OneToMany(mappedBy = "Filiale", cascade = CascadeType.ALL)
	private Set<Secteur> secteur;

	public Filiale() {
		super();
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Secteur> getSecteur() {
		return secteur;
	}

	public void setSecteur(Set<Secteur> secteur) {
		this.secteur = secteur;
	}

}
