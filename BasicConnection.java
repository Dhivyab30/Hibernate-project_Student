package org.anudip.main;

import org.anudip.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class BasicConnection {

	public static void main(String[] args) {
		SessionFactory sf= HibernateUtil.getMySessionFactory();
		System.out.println(sf);
		Session so= sf.openSession();
		System.out.println(so);
		
		
		
		

	}

}
