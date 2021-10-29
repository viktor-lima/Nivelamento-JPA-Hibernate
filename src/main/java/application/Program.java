package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Pessoa p = em.find(Pessoa.class,2);
		em.remove(p);

		em.getTransaction().commit();

		System.out.println("PRONTO");
		em.close();
		emf.close();
	}
}
