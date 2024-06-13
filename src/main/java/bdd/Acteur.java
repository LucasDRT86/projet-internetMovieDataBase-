package bdd;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Acteur extends Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="TAILLE", nullable = false)
	double taille;
	
	@Column(name="URL", length = 100, nullable = false)
	String url;
	
	@OneToOne(mappedBy = "acteur")
	private Set<Personne> personnes = new HashSet<>();

	public Acteur(String ville, String region) {
		super(ville, region);
	}

}
