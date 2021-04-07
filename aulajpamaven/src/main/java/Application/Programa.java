package Application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = enf.createEntityManager();
		Pessoa p = em.find(Pessoa.class, 2);
		em.remove(p);
		System.out.println("Pronto!");
		em.close();
		enf.close();

	}

}
