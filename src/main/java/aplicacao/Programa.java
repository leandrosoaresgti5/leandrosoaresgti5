package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import dominio.Pessoa;


public class Programa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
			
		
		p1.setNome("joao");
		p1.setEmail("teste@gmail.com");
		p2.setNome("maria");
		p2.setEmail("maria@gmail.com");
		p3.setNome("zezinho");
		p3.setEmail("zezinho@gmail.com");
		 EntityManagerFactory SessionFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		
		EntityManager entityManager = SessionFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityManager.getTransaction().commit();
		entityManager.close();
	
	}

}
