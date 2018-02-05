package model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import model.dao.FlightDAOHibernate;
import model.hibernate.HibernateUtil;

/**
 * Servlet implementation class FlightGet
 */
@WebServlet("/FlightGet")
public class FlightGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FlightGet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		FlightDAOHibernate rs = new FlightDAOHibernate(session);
		FlightBean bean=rs.selectAll().get(0);
		System.out.println(bean);
		request.getSession().setAttribute("flight",bean);

		session.getTransaction().commit();
		response.sendRedirect("/SabreWeb/page/02select.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
