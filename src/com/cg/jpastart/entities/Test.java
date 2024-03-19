package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	

	public static void main(String[] args)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");////creating an entity manager factory
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Employee employee=new Employee();
		employee.setEmployeeID(542);
		employee.setName("Shirisha");
		employee.setSalary(50000);
		Company company=new Company();
		company.setCompanyID(125);
		company.setName("Capgemini");
		employee.setCompany(company);
		em.persist(employee);
        em.getTransaction().commit();//closing 
		
		System.out.println("Added one employee with employeeId to database.");
		em.close();
		factory.close();
	}

}
