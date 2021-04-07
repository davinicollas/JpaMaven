package Application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "carlos da silva", "calos@hotmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim torres", "joaquim@hotmail.com");
		Pessoa p3 = new Pessoa(null, "tevez", "tevez@hotmail.com");
		
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = enf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto!");

	}

}
