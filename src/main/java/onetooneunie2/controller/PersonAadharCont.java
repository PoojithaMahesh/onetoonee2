package onetooneunie2.controller;

import onetooneunie2.dao.AadharCardDao;
import onetooneunie2.dao.PersonDao;
import onetooneunie2.dto.AadharCard;
import onetooneunie2.dto.Person;

public class PersonAadharCont {
public static void main(String[] args) {
	
//	Person person=new Person();
//	person.setId(1);
//	person.setName("Poojitha");
//	person.setAddress("kar");
//	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(100);
//	aadharCard.setName("PoojithaJM");
//	aadharCard.setAge(16);
//	
//	person.setAadharCard(aadharCard);
//	
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.saveAadhar(aadharCard);
//	
//	PersonDao personDao=new PersonDao();
//	personDao.savePerson(person);
//	
//	select
	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.getAadharById(100);
//	
//	PersonDao personDao=new PersonDao();
//	personDao.getPersonById(1);
//	
	
	
//	Delete
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.deleteAdharById(100);
//	
	
	
//	PersonDao personDao=new PersonDao();
//	personDao.deletePersonById(1);
//	
//	
	
//update the data
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setAge(25);
//	aadharCard.setName("POOJITHA");
//	
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.updateAdhar(100, aadharCard);
//	
//	
	
	
	Person person=new Person();
	person.setName("POOJI");
	person.setAddress("mysore");
	

	

//	person=name address
	PersonDao personDao=new PersonDao();
	personDao.updatePerson(2, person);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
