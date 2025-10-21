package org.anudip.main;

import java.util.List;

import org.anudip.entity.Student;
import org.anudip.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CRUDApp {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getMySessionFactory();
		Session so=sf.openSession();
		
		Transaction ts=so.beginTransaction();
		//Insert 
		//Student s1= new Student(101,"Nandhini","Chennai");
		//Student s2= new Student(102,"Kalai","Villupuram");
		
		
		//so.save(s1);
		//so.save(s2);
		//ts.commit();
		//Read
	 //Student s= so.get(Student.class, 101);
	 //System.out.println(s);
	 
	 
	 //Update
//	 Student su= so.get(Student.class, 102);
//	 su.setsLocation("Pondy");
//	 so.update(su);
//	 ts.commit();
	 
		//Delete
		Student sd= so.get(Student.class, 101);
		so.delete(sd);
		ts.commit();
		
		
		
	 
	 
	 
		
		so.close();
		sf.close();
		
	}

}
