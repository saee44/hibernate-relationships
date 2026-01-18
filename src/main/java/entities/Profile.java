package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Profile {
		@Id
		int id;
		String bio;
		
		@OneToOne
		@JoinColumn(name="user_id")
		User user;
		
		public Profile(int id, String bio,User user) {
			
			this.id = id;
			this.bio = bio;
			this.user=user;
		}
		public Profile(){}
		public void setUser(User user) {
			this.user=user;
		}
		public User getUser() {
			return user;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getBio() {
			return bio;
		}
		public void setBio(String bio) {
			this.bio = bio;
		}
		
		
		
		
		
}
