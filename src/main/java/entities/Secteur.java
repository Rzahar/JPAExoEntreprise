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
@Table(name = "secteur")
public class Secteur {
	@Id
	@Column(name = "nom_secteur")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private String nom;
	private String localisation;

	@OneToMany(mappedBy = "secteur", cascade = CascadeType.ALL)
	private Set<Employe> employe;

	@ManyToOne
	@JoinColumn(name = "nom_filiale")
	private Filiale filiale;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public Set<Employe> getSalarie() {
		return employe;
	}

	public void setSalarie(Set<Employe> employe) {
		this.employe = employe;
	}

}
