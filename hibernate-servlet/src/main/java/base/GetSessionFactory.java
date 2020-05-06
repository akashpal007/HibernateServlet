package base;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetSessionFactory {
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			return new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;
	}

}
