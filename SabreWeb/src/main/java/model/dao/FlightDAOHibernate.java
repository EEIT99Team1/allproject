package model.dao;

import java.util.List;

import org.hibernate.Session;

import model.FlightBean;
import model.hibernate.HibernateUtil;

public class FlightDAOHibernate {
	
	public static void main(String[] args) {
	Session session = HibernateUtil.getSessionFactory().getCurrentSession();	
	session.beginTransaction();
	
	FlightDAOHibernate rs = new FlightDAOHibernate(session);
	System.out.println("SelectAll = "+rs.selectAll());
	
	
	session.getTransaction().commit();
	HibernateUtil.closeSessionFactory();
	}

	private Session session = null;

	public FlightDAOHibernate(Session session) {
		this.session = session;
	}

	public Session getSession() {
		return session;
	}

	private static final String SELECT_ALL = "from FlightBean";

	public List<FlightBean> selectAll() {

		return this.getSession().createQuery(SELECT_ALL, FlightBean.class).list();

	}

}
