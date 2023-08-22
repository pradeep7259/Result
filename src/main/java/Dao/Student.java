package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Dto.Records;

public class Student {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	
	public void save(Records records)
	{
		transaction.begin();
		manager.persist(records);
		transaction.commit();
	}
	
	public List<Records> fetchAll() 
	{
		return  manager.createQuery("select x from Records x").getResultList();
	}

	public Records fetchRecord(int id) {
		return manager.find(Records.class, id);
		
	}

	public void update(Records records) 
	{
		transaction.begin();
		manager.merge(records);
		transaction.commit();
		
	}

	public void remove(Records record) 
	{
		transaction.begin();
		manager.remove(record);
		transaction.commit();
	}
}
