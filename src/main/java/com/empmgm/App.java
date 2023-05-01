package com.empmgm;

/**
 * Hello world!
 *
 */
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    
//    	employee e1=new employee();
//    	e1.setEmpId(15);
//    	e1.setEmpName("sushmitha");
//    	e1.setEmpLocation("Hyd");
//    	e1.setEmpProject("React");
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(employee.class);
    	SessionFactory sf=con.buildSessionFactory();
    	
    	Session ses=sf.openSession();
    	
    	Transaction tx=ses.beginTransaction();
    	
    	employee e2=new employee();
    	
    		
    		//ses.save(e1)
    	
    	//e2= ses.get(employee.class,13); //to retrive data of user
    	
//    	String city="vskp";
//    	e2=(employee)ses.createQuery("from employee where empLocation=:city")
//    			.setParameter("city", city).uniqueResult();
    	
//    	Query qu=ses.createQuery("from employee");
//    	
//    	List<employee> li=qu.list();
//    	
//    	for(employee e:li)
//    			System.out.println(e.getEmpId()+" : "+e.getEmpName());
//    	
    	
//    	Query q=ses.createQuery("update employee set empLocation=:location where empId=:id")
//    			.setParameter("location","pune").setParameter("id",14);
//    	int status=q.executeUpdate();
//    	System.out.println(status);

    	Query qu=ses.createQuery("delete from employee where empId=:id").setParameter("id",14);

    	System.out.println(qu.executeUpdate());	
    	
    	
    	
    	
    	tx.commit();
    	
    	//System.out.println("employee name is "+e2.getEmpName());
    	
    	//System.out.println(e2);
    	
    	
    	
    }
}
