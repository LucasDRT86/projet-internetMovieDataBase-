package Menu;

public class Menu {

	public static void afficherMenu() {
        System.out.println("Menu :");
        System.out.println("1. Affichage de la filmographie d'un acteur donné");
        System.out.println("2. Affichage du casting d'un film donné");
        System.out.println("3. Affichage des films sortis entre 2 années données");
        System.out.println("4. Affichage des films communs à 2 acteurs/actrices donnés");
        System.out.println("5. Affichage des acteurs communs à 2 films donnés");
        System.out.println("6. Affichage des films sortis entre 2 années données et qui ont un acteur/actrice donné au casting");
        System.out.println("7. Fin de l'application");
        System.out.print("Choix : ");
    }

    /*private static void afficherFilmographie() {
        System.out.print("Entrez le nom de l'acteur : ");
        String nomActeur = scanner.nextLine();

        // Récupérer l'acteur depuis la base de données (simulée)
        Acteur acteur = baseDeDonnees.trouverActeurParNom(nomActeur);
        if (acteur != null) {
            // Afficher la filmographie
            for (Film film : acteur.getFilmographie()) {
                System.out.println(film.getTitre() + " (" + film.getAnneeSortie() + ")");
            }
        } else {
            System.out.println("Acteur non trouvé.");
        }
    }*/
	
	public static void afficherFilmographie() {
		
	}
	
	public static void afficherCastingFilm() {
	}
	
	public static void afficherFilmsEntreAnnees() {
	}
	
	public static void afficherFilmsCommunsActeurs() {
	}
	
	public static void afficherActeursCommunsFilms() {
	}
	
	public static void afficherFilmsAnneesActeur() {
	}
}
