package lecture;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Entites.Acteur;
import Entites.Film;
import Entites.Role;

public class LectureRoles {
	public List<Role> lireFichier() {

		List<Role> roles = new ArrayList<>();

		Path path = Paths.get("src/main/ressources/films.csv");

		try {
			List<String> lignes =Files.readAllLines(path);
			List<Film> films = new ArrayList<>();
			List<Acteur> acteurs = new ArrayList<>();
			
			lignes.remove(0);
			for(String ligne : lignes) {
				String[] elt = ligne.split(";");
				Acteur a = new Acteur();
				a.setId(Integer.parseInt(elt[1]));
				
				if(!acteurs.contains(a)) {
					acteurs.add(a);
				}
			}
			
			for(String ligne : lignes) {
				String[] elt = ligne.split(";");
				Role r = new Role();
				
				r.setFilm(null);
				r.setActeur(acteurs);
				r.setPersonnage(elt[2]);
				
				roles.add(r);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return roles;
	}
}
