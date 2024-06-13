package bdd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="NOM", length = 50, nullable = false)
	String nom;
	
	@Column(name="ANNEE", length = 4, nullable = false)
	int annee;
	
	@Column(name="RATING", nullable = false)
	double rating;
	
	@Column(name="LANGUE", length = 25, nullable = false)
	String langue;
	
	@Column(name="RESUME", length = 255, nullable = false)
	String resume;
	
	@Column(name="URL", length = 100, nullable = false)
	String url;
	
	public Film(String nom, int annee, double rating, String langue, String resume) {
		this.nom = nom;
		this.annee = annee;
		this.rating = rating;
		this.langue = langue;
		this.resume = resume;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}
	
	
	
	
}
