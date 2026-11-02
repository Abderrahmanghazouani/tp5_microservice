package com.microservice.product;

import com.microservice.product.config.AppConfig;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestHibernate {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Contexte Spring initialisé avec succès !");

        SessionFactory sessionFactory = context.getBean(SessionFactory.class);
        System.out.println("SessionFactory initialisée : " + (sessionFactory != null));

        context.close();
    }
}
