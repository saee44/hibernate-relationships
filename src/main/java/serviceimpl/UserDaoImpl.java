package serviceimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.User;
import services.UserDao;
import utilities.HButil;

public class UserDaoImpl implements UserDao {
	public void addUser(User user) {
		Session session = HButil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(user.getProfile());
		session.save(user);
		tx.commit();
		session.close();
	}

	public User getUser(int id) {
		Session session = HButil.getSession();
		Transaction tx = session.beginTransaction();
		User user = session.get(User.class, id);
		tx.commit();
		session.close();
		return user;

	}

	public void updateUser(int id,String name) {
		Session session = HButil.getSession();
		Transaction tx = session.beginTransaction();
		User user = session.get(User.class, id);
		if (user != null) {

			user.setUser(name);
			session.update(user);
		} else {
			System.out.println("user not found");
		}
		tx.commit();
		session.close();

	}

	public void deleteUser(int id) {
		Session session=HButil.getSession();
		Transaction tx=session.beginTransaction();
		User user=session.get(User.class, id);
		if(user!=null) {
			session.delete(user);
		}
		else {
			System.out.println("user not found");
		}
		tx.commit();
		session.close();
		//this only deletes the user not the profile linked to it .to delete the profile either use cascade or delete manually
	}
}
