package serviceimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.User;
import services.UserDao;
import utilities.HButil;

public class UserDaoImpl implements UserDao{
		public void addUser(User user) {
			Session session=HButil.getSession();
			Transaction tx=session.beginTransaction();
			session.save(user.getProfile());
			session.save(user);
			tx.commit();
			session.close();
		}
		public User getUser(int id) {
			Session session=HButil.getSession();
			Transaction tx=session.beginTransaction();
			
			 return session.get(User.class, id);
			
		}
		public void UpdateUser() {
			System.out.println("in update");
		}
		public void deleteUser() {
			System.out.println("in delete user");
		}
}
