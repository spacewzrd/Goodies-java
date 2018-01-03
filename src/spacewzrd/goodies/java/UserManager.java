package spacewzrd.goodies.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class UserManager {
	
	public static void newuser(String username, String email, String password) {
		User user = new User();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		
		EntityManagerFactory emf = DBUtil.getEmFactory();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		
//		need to add in filtering to make sure all fields are legit
	}

}
