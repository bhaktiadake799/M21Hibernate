package com.cg.association4;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();



		product elecProduct = new product();
		elecProduct.setId(1);
		elecProduct.setName("LED TV");
		elecProduct.setPrice(45000);

		product beautyProduct = new product();
		beautyProduct.setId(2);
		beautyProduct.setName("Face Wash");
		beautyProduct.setPrice(80);

		product babyProduct = new product();
		babyProduct.setId(3);
		babyProduct.setName("Pampers");
		babyProduct.setPrice(15);

		product eleProduct = new product();
		eleProduct.setId(4);
		eleProduct.setName("CFL Bulb");
		eleProduct.setPrice(250);

		Order firstOrder = new Order();
		firstOrder.setId(1000);
		firstOrder.setPurchaseDate(new Date( ));

		firstOrder.addProduct(babyProduct);
		firstOrder.addProduct(elecProduct);
		firstOrder.addProduct(beautyProduct);

		Order secondOrder = new Order();
		secondOrder.setId(1001);
		secondOrder.setPurchaseDate(new Date());

		secondOrder.addProduct(babyProduct);		
		secondOrder.addProduct(elecProduct);
		secondOrder.addProduct(eleProduct);


		em.persist(firstOrder);
		em.persist(secondOrder);
		
		System.out.println("Added orders along with order details to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}


