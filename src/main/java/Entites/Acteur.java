package Entites;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
public class Acteur extends Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="TAILLE", nullable = false)
	double taille;
	
	@Column(name="URL", length = 100, nullable = false)
	String url;
	
	@OneToOne
    @JoinColumn(name = "personne_id", referencedColumnName = "id")
	private Personne personne;	

	@ManyToMany
	@JoinTable(name="role_acteur",
	joinColumns= @JoinColumn(name="id_acteur", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_role", referencedColumnName=
	"id")
	 )
	private List<Role> role = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="acteur_film",
	joinColumns= @JoinColumn(name="id_acteur", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_film", referencedColumnName=
	"id")
	 )
	private List<Film> film = new ArrayList<>();
	
	public Acteur() {
	}

	public Acteur(String ville, String region) {
		super(ville, region);
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getTaille() {
		return taille;
	}



	public void setTaille(double taille) {
		this.taille = taille;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public Personne getPersonne() {
		return personne;
	}



	public void setPersonne(Personne personne) {
		this.personne = personne;
	}



	public List<Role> getRole() {
		return role;
	}



	public void setRole(List<Role> role) {
		this.role = role;
	}



	public List<Film> getFilm() {
		return film;
	}



	public void setFilm(List<Film> film) {
		this.film = film;
	}
	
	

}
