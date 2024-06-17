package lecture;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Entites.Film;
import Entites.Genre;
import Entites.Pays;

public class LectureGenre {
	
	public List<Genre> lireFichier() {

		List<Genre> genres = new ArrayList<>();

		Path path = Paths.get("src/main/ressources/films.csv");

		try {
			List<String> lignes =Files.readAllLines(path);
			lignes.remove(0);

			for(String ligne : lignes) {
				List<Genre> gList = new ArrayList<>();
				

				String[] elt = ligne.split(";");
				String[] eltGenre = elt[6].split(",");
				
				for(String genreSplit : eltGenre) {
					Genre g = new Genre();
					g.setNom(genreSplit);
					
					gList.add(g);
				}
				
				for(Genre g : gList) {
					if(!genres.contains(g)) {
						genres.add(g);
					}
				}

 
				//acteur.set
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return genres;
	}
}
