package com.anudip;


import java.util.ArrayList;
import java.util.List;

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
    public static void main( String[] args )
    {
    	Configuration cfg =  new Configuration().configure().addAnnotatedClass(Teacher.class);
     	Configuration cfg1=new Configuration().configure().addAnnotatedClass(Course.class);
     	SessionFactory sf = cfg.buildSessionFactory(); // build Session factory
     	// session
     	Session ss = sf.openSession();
     	Transaction tx = ss.beginTransaction(); // transaction start

    	
    	//create Teacher
    	Teacher t = new Teacher();
    	t.setT_ID(1);
    	t.setName("Mrunali");
    	
    	//create Teacher
    	Teacher t1 = new Teacher();
    	t1.setT_ID(2);
    	t1.setName("Deshmukh");
    	
    	// create course
    	Course c = new Course();
    	c.setC_Id(101);
    	c.setCourse_name("Java");
    	c.setTeacher(t);
    	
    	
    	// create course
    	Course c1 = new Course();
    	c1.setC_Id(102);
    	c1.setCourse_name("Python");
    	c1.setTeacher(t);
    	
    	// create  course
    	Course c2 = new Course();
    	c2.setC_Id(103);
    	c2.setCourse_name("Angular");
    	c2.setTeacher(t);
    	
    	// create course
    	Course sc = new Course();
    	sc.setC_Id(104);
    	sc.setCourse_name("Core Java");
    	sc.setTeacher(t1);
    	
    	// create course
    	Course sc1 =new Course();
    	sc1.setC_Id(105);
    	sc1.setCourse_name("C++");
    	sc1.setTeacher(t1);
    	
    	// course add in list
    	List<Course>course=new ArrayList<Course>();
    	// add course in list
    	course.add(c);
    	course.add(c1);
    	course.add(c2);
    	 // course add in list
    	List<Course>course1=new ArrayList<Course>();
    	course1.add(sc);
    	course1.add(sc1);
    	
    	
    	
		t.setCourse(course); 
		t1.setCourse(course1);
		
		//save
		ss.save(t);
		ss.save(t1);
		ss.save(c);
		ss.save(c1);
		ss.save(c2);
		ss.save(sc);
		ss.save(sc1);
		
		tx.commit();
	
    }
   
}