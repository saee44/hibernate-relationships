package entities;

public class Student {
	int id;
	String name;
	int rollNo;

	public Student(int id,String name,int rollNo) {
	   this.id=id;
	   this.name=name;
	   this.rollNo=rollNo;
   }

	public Student() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;

	}

	public String getName() {
		return name;

	}

	public int getId() {
		return id;
	}

	public int getRollNo() {
		return rollNo;
	}
}
