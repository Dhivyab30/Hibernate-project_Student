package org.anudip.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf;
	
	static {
		try {
			sf= new Configuration().configure().buildSessionFactory();
			System.out.println(sf);
			
		}
		catch( Exception e)
		{
			e.printStackTrace();
			
		}
		
	}
	
	
	public static SessionFactory getMySessionFactory()
	{
		System.out.println(sf);
		return sf;
		
	}
	

}
