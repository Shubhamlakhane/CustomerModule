package com.fujitsu.orm.main;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fujitsu.beans.Customer;


public class HibernateMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create configuration 
		
		Configuration cfg= new Configuration();
		
		//read hibernate properties from hibernate.cfg.xml
		Configuration c = cfg.configure();
		
		//obtain session factory through configuration
		SessionFactory factory =c.buildSessionFactory();
		
		//get session from sessionfactory
		//represents database connection
		Session session = factory.openSession();
		
		//get transaction through session
		Transaction tx = session.beginTransaction();
	
		
		
		//database operation logic
	
		
		
       Customer	customer = new Customer();
       customer.setCustomer_Id(1001);
       customer.setCustomer_Name("Shubham");
       customer.setPhone_No(9856325698L);
       customer.setEmail_Id("shubham@gmail.com");
       customer.setGender("male");
       customer.setId_Type("adhar card");
       customer.setId_No("7458965236ab");
       customer.setNationality("indian");
       customer.setAge(25);
       customer.setCountry_Code(1001L);
       
       customer.setCity("pune");
       customer.setState("maharashtra");
       customer.setCountry("india");
       customer.setZip(411014);
       customer.getUser();
       
       
       
   
		
		session.save(customer);
		//1-insert new product
		
		  
		
		//commit transaction
		tx.commit();
		
		//close session-close database connection
		session.close();
		
	}

}
