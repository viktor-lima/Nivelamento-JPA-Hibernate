package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		  Pessoa p4 = new Pessoa(null, "viktor Lima", "viktor@gmail.com");
		  
		  em.getTransaction().begin(); em.persist(p4); em.getTransaction().commit();
		 		
		System.out.println("PRONTO");
		em.close();
		emf.close();
	}
}
