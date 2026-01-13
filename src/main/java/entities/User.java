package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {
		@Id
		int id;
		String name;
		
		@OneToOne
		@JoinColumn(name="profile_id")
		Profile profile;
		
		public User(int id,String name,Profile profile){
			this.id=id;
			this.name=name;
			this.profile=profile;
		}
		public User(){
			
		}
		public void setProfile(Profile profile) {
			this.profile=profile;
		}
		public Profile getProfile() {
			return profile;
		}
		public void setUser(String name) {
			this.name=name;
		}
		public void setId(int id) {
			this.id=id;
		}
		public String getName() {
			return name;
		}
		public int getId() {
			return id;
		}
		
}
