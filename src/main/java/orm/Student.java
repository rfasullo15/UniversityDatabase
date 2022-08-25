package orm;


/**
 * An instance of a Student is a data sack that holds information about a student including their ID, email, box number, name (first, middle, last), classification, and the list of course IDs that the 
 * student is enrolled in.
 * @author 90rfa
 *
 */


public class Student {
	private Integer stuId;
	private String email = null;
	private Integer box = null;
	private String name = null; // first, middle, last
	private String classif = null;
	
	
	public Integer getStuId() {
		return stuId;
	}
	public Student setStuId(int id) {
		this.stuId = id;
		return this;
	}
	
	
	public String getEmail() {
		return email;
	}
	public Student setEmail(String email) {
		this.email = email;
		return this;
	}
	
	
	public Integer getBox() {
		return box;
	}
	public Student setBox(int box) {
		this.box = box;
		return this;
	}
	
	
	public String getName() {
		return name;
	}
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	
	
	public String getClassif() {
		return classif;
	}
	public Student setClassif(String classif) {
		this.classif = classif;
		return this;
	}

	
	

}