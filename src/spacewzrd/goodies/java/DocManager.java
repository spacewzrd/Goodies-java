package spacewzrd.goodies.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.http.HttpSession;

import org.hibernate.query.Query;


public class DocManager {

	public static void main(String[] args) {
		
//		for testing will delete later
		Doc doc = new Doc();
		doc.setTitle("NEW");
		doc.setBody("this is the body X2");
		
		EntityManagerFactory emf = DBUtil.getEmFactory();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(doc);
		em.getTransaction().commit();
		em.close();
		

	}
	
	public static void newdoc(String title, String body) {
		Doc doc = new Doc();
		doc.setTitle(title);
		doc.setBody(body);
		
		EntityManagerFactory emf = DBUtil.getEmFactory();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(doc);
		em.getTransaction().commit();
		em.close();
//		need to add in filtering to make sure all fields are legit
	}
	
	public List<Object[]> allDocs(){
		EntityManagerFactory emf = DBUtil.getEmFactory();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		String query = "from Doc";
		List<Object[]> result = em.createQuery(query, Object[].class).getResultList();
		em.close();
		return result;
	
	}
	
	public void delete(String title) {
		EntityManagerFactory emf = DBUtil.getEmFactory();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		String query = "delete from Doc where title = :title";
	    Query q = (Query) em.createQuery(query).setParameter("title", title);
	    q.executeUpdate();
		
		em.getTransaction().commit();
		em.close();
	    
	}


//	Needs edit
}
