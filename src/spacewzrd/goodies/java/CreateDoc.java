package spacewzrd.goodies.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class CreateDoc {

	public static void main(String[] args) {
		
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
	}

}
