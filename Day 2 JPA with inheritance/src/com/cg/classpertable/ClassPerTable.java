package com.cg.classpertable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClassPerTable {
	public static void manin(String[]args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee.emp=new Employee();
		emp.setNmae("Bhakti");
		emp.setSalary(7000);
		em.persist(emp);
		
		Manager man = new Manager();
		man.setName("Trisha");
		man.setSalary(5000);
		man.setDepartmentName("Sales");
		em.persist(man);
		
		em.getTransaction().commit();
		System.out.println("Added one employee to database");
		em.close();
		factory.close();
		
		
		
	}

}
