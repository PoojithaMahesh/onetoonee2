package onetooneunie2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunie2.dto.AadharCard;
import onetooneunie2.dto.AadharCard;

public class AadharCardDao {
	public void saveAadhar(AadharCard card) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(card);
		entityTransaction.commit();
	}

	public void getAadharById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard = entityManager.find(AadharCard.class, id);
		if (dbAadharCard != null) {
			System.out.println(dbAadharCard);
		} else {
			System.out.println("Sorry id is not present");
		}

	}
	public void deleteAdharById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		AadharCard dbCard = entityManager.find(AadharCard.class, id);
		if (dbCard != null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbCard);
			entityTransaction.commit();
		} else {
			System.out.println("Sorry id is not present");
		}
	}

	
	public void updateAdhar(int id,AadharCard aadharCard) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		AadharCard dbCard = entityManager.find(AadharCard.class, id);
		if (dbCard != null) {
//			i can update
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			aadharCard.setId(id);
			entityManager.merge(aadharCard);
			entityTransaction.commit();
		} else {
			System.out.println("Sorry id is not present");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
