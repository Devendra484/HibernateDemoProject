package com.springboot.DemoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Laptops laptops=new Laptops();
        
        Students students=new Students();
		
		  laptops.setId(1L); laptops.setName("Hp");
		  laptops.setPrice(60000.00);
		  laptops.setStudents(students); 
		  students.setId(101L);
		  students.setName("devendra"); students.setRollNo("161484");
		  students.setMarks(80);
		 

        Configuration configuration=new Configuration().configure().addAnnotatedClass(Laptops.class).addAnnotatedClass(Students.class);
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        SessionFactory sessionFactory= configuration.buildSessionFactory(ssr);
     
        Session session1= sessionFactory.openSession();
        session1.beginTransaction();   
        session1.save(laptops);  //1. Save the Object data
        session1.save(students);
        
        laptops=(Laptops) session1.get(Laptops.class, 1L);  //2.get or Fetch the Data
        students=(Students) session1.get(Students.class, 101L);

        session1.getTransaction().commit();
        session1.close();
        
        
		/*
		 * Session session2= sessionFactory.openSession(); session2.beginTransaction();
		 * 
		 * session2.save(laptops); //1. Save the Object data session2.save(students);
		 * 
		 * laptops=(Laptops) session2.get(Laptops.class, 1L); //2.get or Fetch the Data
		 * students=(Students) session2.get(Students.class, 101L);
		 * 
		 * session2.getTransaction().commit(); session2.close();
		 */
    }
}


/*
*Hibernate Architecture, configuration , Hibernate session, Mapping b/w obj and tables,
* crud operations, hql, criteria API, Transactions, Caching, Relationships,
* lazyLoading, springIntegration.
*
* */