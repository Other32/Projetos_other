package dao;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Carro;
import util.HibernateUtil;

public class CarroDao implements CarroDaoI {
	
	
	/**
	 * by Clarismilton
	 */
	public void ferraTudo() {
		
	}
	
	@Override
	public void insert(Carro c) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.delete(c);
		tx.commit();
		s.close();
		
		
	}

	@Override
	public void delete(Carro c) {
		
		
	}

	@Override
	public void update(Carro c) {
		
		
	}

	@Override
	public Carro select(Carro c) {
		
		return null;
	}

	
}
