package Entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="ville", length = 255, nullable = false)
	String ville;
	
	@Column(name="region")
	String region;
	
	@OneToOne(mappedBy ="personne")
	private Acteur acteur;
	
	@OneToOne(mappedBy ="personne")
	private Realisateur realisateur;
	
	@ManyToOne
	@JoinColumn(name="id_lieux")
	private Lieux lieux; 

	public Personne() {
	}

	public Personne(String ville, String region) {
		this.ville = ville;
		this.region = region;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	
}
