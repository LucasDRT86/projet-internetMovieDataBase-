package bdd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="PERSONNAGE", length = 50, nullable = false)
	String personnage;

	
	
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
