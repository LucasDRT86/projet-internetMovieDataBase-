package Entites;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Lieux {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="VILLE", length = 255, nullable = false)
	String ville;
	
	@Column(name="REGION", length = 255, nullable = false)
	String region;
	
	@ManyToOne
	@JoinColumn(name="id_pays")
	private Pays pays; 
	
	@OneToMany(mappedBy="lieux")
	List<Personne> personne = new ArrayList<>();

	public Lieux() {
	}

	public Lieux(String ville, String region) {
		this.ville = ville;
		this.region = region;
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
