package edu.uniandes.ecos.arquisoft.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Clase encargada del manejo de las conexiones a la base de datos
 * via Hibernate. Se diseña como Singleton por la necesidad de asegurar una sola 
 * conexión al handler 
 * @author drenteria
 *
 */
public class HibernateDBManager {
	
	private static HibernateDBManager instance;
	
	private final SessionFactory sessionFactory;
	
	private HibernateDBManager(){
		Configuration hbConfig = new Configuration();
		hbConfig.configure();
		ServiceRegistry hbServiceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(hbConfig.getProperties()).build();
		sessionFactory = hbConfig.buildSessionFactory(hbServiceRegistry);
	}

	public static HibernateDBManager getInstance(){
		if(instance == null){
			instance = new HibernateDBManager();
		}
		return instance;
	}
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}