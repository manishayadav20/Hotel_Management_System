package org.example.config;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
    private static Hibernate instance=new Hibernate();
    private SessionFactory sessionFactory;

    public static Hibernate getInstance() {
        return instance;
    }
    private Hibernate(){
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        sessionFactory=configuration.buildSessionFactory();


        // SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }
    public static Session getSession(){
        Session session=getInstance().sessionFactory.openSession();
        return session;
    }
}
