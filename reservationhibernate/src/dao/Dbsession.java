package dao;



import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * Startup Hibernate and provide access to the singleton SessionFactory
 */
public class Dbsession {

  private static SessionFactory sessionFactory;

  static {
    try {
       sessionFactory = new Configuration().configure().buildSessionFactory();
    } catch (Throwable ex) {
       throw new ExceptionInInitializerError(ex);
    }
  }

  public static SessionFactory getSessionFactory() {
      // Alternatively, we could look up in JNDI here
      return sessionFactory;
  }

  public static void shutdown() {
      // Close caches and connection pools
      getSessionFactory().close();
  }
}
