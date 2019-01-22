package dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;


import entities.Client;

public class ClientDaoImpl implements IClientDao{

	@Override
	public void add(Client c) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();// ouvrir une session
		Transaction tx=s.beginTransaction();//commencer une transaction
		s.save(c);//enregistrer client c
		tx.commit();// valider la transaction
		s.close();// fermer la session
	
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();
		List<Client> l=s.createQuery("from Client").list();
		s.close();
		return l;
	}

	@Override
	public void delete(Client c) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();//commencer une transaction
		s.delete(c);// supprimer le client c
		tx.commit();
		s.close();
		
	}

	@Override
	public void update(Client c) {
		// TODO Auto-generated method stub
		Session s=Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();//commencer une transaction
		s.update(c);// modifier le client c
		tx.commit();
		s.close();
	}

}
