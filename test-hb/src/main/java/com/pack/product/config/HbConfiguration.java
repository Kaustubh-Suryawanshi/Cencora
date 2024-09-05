package com.pack.product.config;

import java.util.Properties;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.pack.product.Product;

 

public class HbConfiguration {

	private static SessionFactory sf;
	
	public static SessionFactory getSessionFactory()
	{
		
		 if(sf==null) {
			try { 
			 Configuration cfg=new Configuration();
			 Properties props=new Properties();
			 props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			 props.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernatedb?useSSL=false");
			 props.put(Environment.USER, "root");
			 props.put(Environment.PASS, "password");
			 props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			 props.put(Environment.SHOW_SQL,"true");
			 props.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
			 props.put(Environment.HBM2DDL_AUTO, "update");
			 cfg.setProperties(props);
			 cfg.addAnnotatedClass(Product.class);
			ServiceRegistry srv=new StandardServiceRegistryBuilder()
			 .applySettings(cfg.getProperties()).build();
			sf =cfg.buildSessionFactory(srv);
		 }   catch(Exception e)
			{
			 
			 e.printStackTrace();
			}
		 }
		 
		return sf;
	}
	
	
}
