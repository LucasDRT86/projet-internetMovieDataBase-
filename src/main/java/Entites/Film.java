package Entites;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

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
	
	@ManyToMany
	@JoinTable(name="genre_film",
	joinColumns= @JoinColumn(name="id_film", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_genre", referencedColumnName=
	"id")
	 )
	private List<Genre> genre = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="realisateur_film",
	joinColumns= @JoinColumn(name="id_film", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_realisateur", referencedColumnName=
	"id")
	 )
	private List<Realisateur> realisateur = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="genre_film",
	joinColumns= @JoinColumn(name="id_film", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_role", referencedColumnName=
	"id")
	 )
	private List<Role> Role = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="acteur_film",
	joinColumns= @JoinColumn(name="id_film", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_acteur", referencedColumnName=
	"id")
	 )
	private List<Acteur> acteur = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="id_pays")
	private Pays pays; 
	
	public Film() {
	}

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
