package com.netbanking.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class h_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock stk = new Stock();
		stk.setId(123);
		stk.setCode("ARP");
		stk.setName("ARPAN");
		
		SessionFactory SF = new Configuration().configure().buildSessionFactory();
		Session session = SF.openSession();
		session.beginTransaction();
		/*session.save(stk);
		session.getTransaction().commit();
		session.close();*/
		Stock stk2 = new Stock();
		stk2 = (Stock)session.get(Stock.class, 456);
		System.out.println("User Retrieved: "+stk2.getName());
	}

}

