package entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "societe")
public class Entreprise {
	private String nom;
	@OneToMany(mappedBy = "Entreprise", cascade = CascadeType.ALL)
	private Set<Filiale> filiale;

	public Set<Filiale> getFiliale() {
		return filiale;
	}

	public void setFiliale(Set<Filiale> filiale) {
		this.filiale = filiale;
	}

	public Entreprise() {
		super();
	}

	@Id
	@Column(name = "nom")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
