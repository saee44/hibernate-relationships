package entities;

public class Courses {
		int id;
		String name;
		int duration;
		public Courses(int id, String name, int duration) {
			super();
			this.id = id;
			this.name = name;
			this.duration = duration;
		}
		public Courses(){
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		
		
}
