package dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import bean.Cliente;
import util.HibernateUtil;

public class ClienteDao implements ClienteDaoI {


	public void insert(Cliente c) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(c);
		tx.commit();
		s.close();
	}

	public List<Cliente> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		List<Cliente> list = s.
				createCriteria(Cliente.class)
				.list();
		s.close();
		return list;
	}

}








