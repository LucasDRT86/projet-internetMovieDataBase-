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

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="PERSONNAGE", length = 50, nullable = false)
	String personnage;

	@ManyToMany
	@JoinTable(name="genre_film",
	joinColumns= @JoinColumn(name="id_role", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_film", referencedColumnName=
	"id")
	 )
	private List<Film> film = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="role_acteur",
	joinColumns= @JoinColumn(name="id_role", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_acteur", referencedColumnName=
	"id")
	 )
	private List<Acteur> acteur = new ArrayList<>();
	
	public Role() {
	}

	public Role(String personnage) {
		this.personnage = personnage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonnage() {
		return personnage;
	}

	public void setPersonnage(String personnage) {
		this.personnage = personnage;
	}
	
	
}
