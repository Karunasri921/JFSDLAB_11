package com.klu.JFSDS12_IM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.klu.JFSDS12_IM.Car;
import com.klu.JFSDS12_IM.Cheque;

public class Insertpayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c=new Car();
		Cheque cq=new Cheque();
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session s= sf.openSession();
		
		Transaction t = s.beginTransaction();	
		c.setPid(111);
		c.setPamount(45658.0);
		c.setCardType("debitcard");
		
		cq.setPid(122);
		cq.setPamount(4587.0);
		cq.setChequeType("RTGS");
		
		s.save(c);
		s.save(cq);
		t.commit();
		
		s.close();
		sf.close();
	}

}
