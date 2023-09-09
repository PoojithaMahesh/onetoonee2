package onetooneunie2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunie2.dto.AadharCard;
import onetooneunie2.dto.Person;

public class PersonDao {

	public void savePerson(Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}

	public void getPersonById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person dbPerson = entityManager.find(Person.class, id);
		if (dbPerson != null) {
			System.out.println(dbPerson);
		} else {
			System.out.println("Sorry id is not present");
		}

	}

	public void deletePersonById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person dbPerson = entityManager.find(Person.class, id);
		if (dbPerson != null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbPerson);
			entityTransaction.commit();
		} else {
			System.out.println("Sorry id is not present");
		}
	}
	
	public void updatePerson(int id,Person person) {
//		person =name address
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person dbPerson = entityManager.find(Person.class, id);
		if (dbPerson != null) {
//			i can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			person.setId(id);
//		person=id name address
			person.setAadharCard(dbPerson.getAadharCard());
//			person =id name address and old aadharCard details
			entityManager.merge(person);
			
			entityTransaction.commit();
		} else {
			System.out.println("Sorry id is not present");
		}
	}
	
	
	
	
	
	
	
	
	
}
