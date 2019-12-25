package ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.config.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory = null;

    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
