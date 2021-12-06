package manager;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Employe;
import entities.Entreprise;
import entities.Filiale;
import entities.Secteur;

public class EmployeManager {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory;
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Employe employe = new Employe();
		employe.setNom("Toto");

		Secteur secteur = new Secteur();
		secteur.setNom("Vente");
		employe.setSecteur(secteur);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}