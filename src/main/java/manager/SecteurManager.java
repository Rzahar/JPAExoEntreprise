package manager;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Entreprise;
import entities.Filiale;
import entities.Secteur;

public class SecteurManager {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory;
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();


		
		Secteur secteur = new Secteur();
		secteur.setNom("Nord-Est");
		

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}