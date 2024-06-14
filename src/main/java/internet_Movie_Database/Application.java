package internet_Movie_Database;

import Entites.Personne;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Application {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("database_imdb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		
		transaction.begin();

		/*Personne banque = new Personne("1","2");

		em.persist(banque);


		transaction.commit();*/
		
		em.close();
	}

}
