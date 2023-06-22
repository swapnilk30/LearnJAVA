package com.softura;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
        System.out.println( "Project started..." );
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        
        Student s1=new Student();
        s1.setName("swapnil");
        s1.setCity("Ahmedabad");


        Student s2=new Student();
        s2.setName("vaibhav");
        s2.setCity("mumbai");
        
        Student s3=new Student();
        s3.setName("teju");
        s3.setCity("pune");
        
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        
        session.save(s1);
        session.save(s2);
        session.save(s3);
        
        transaction.commit();
        session.close();
    }
}
