package com.cg.joininheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class joinInheritanceSet {
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employeek employee2 = new Employeek();
		employee2.setName("Shital");
		employee2.setSalary(43000);
		em.persist(employee2);
		
		//create one manager
		ManagerK manager2 = new ManagerK();
		manager2.setName("Karan");
		manager2.setSalary(6400);
		manager2.setDepartmentName("Finance");
		em.persist(manager2);
		
		
		
		em3.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em3.close();
		factory.close();
	}
}


