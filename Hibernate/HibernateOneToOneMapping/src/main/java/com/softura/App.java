package com.softura;

import java.util.Date;

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
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        Customer customer1=new Customer();
        customer1.setFullName("swapnil k");
        customer1.setMobileNumber(123456789);
        
        Transection transection1=new Transection();
        transection1.setDate(new Date());
        transection1.setAmount(9999);
        
        customer1.setTransection(transection1);
        
        session.save(customer1);
      
        Transaction transaction = session.beginTransaction();
        
        transaction.commit();
        
        session.close();
    }
}
