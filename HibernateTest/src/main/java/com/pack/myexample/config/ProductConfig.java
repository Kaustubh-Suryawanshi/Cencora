package com.pack.myexample.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.pack.myexample.model.Product;

public class ProductConfig {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                // Create a new Configuration instance
                Configuration cfg = new Configuration();

                // Set Hibernate properties
                Properties props = new Properties();
                props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                props.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernatedb?serverTimezone=UTC");
                props.put(Environment.USER, "root");
                props.put(Environment.PASS, "root");
                props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
                props.put(Environment.SHOW_SQL, "true");
                props.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                props.put(Environment.HBM2DDL_AUTO, "update");

                cfg.setProperties(props);

                // Add annotated class
                cfg.addAnnotatedClass(Product.class);

                // Build the ServiceRegistry
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(cfg.getProperties())
                        .build();

                // Build the SessionFactory
                sessionFactory = cfg.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                // Log the exception
                e.printStackTrace();
                throw new RuntimeException("Failed to create the SessionFactory", e);
            }
        }

        return sessionFactory;
    }
}