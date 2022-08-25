package orm;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * An instance of the model maintains two lists, the list of Students and the list of Courses. It manages all of the operations between these two lists including insertion, removal and defining relationships.
 * @author 90rfa
 *
 */
public class Model {
	
	private Controller c;
	private HibernateStudentDAO sDAO;
	private HibernateCourseDAO cDAO;

	
	public Model(Controller c) {
		this.c = c;
		sDAO = new HibernateStudentDAO();
	}

	/*
	 * removeCourse will find the course in the master list with the same ID. The students will be removed from the course and their course lists adjusted accordingly. The course will then be removed from the master list of 
	 * courses.
	 */
	public void removeCourse(Course selected) {
		//cDAO.delete(selected)
	}
	
	public void addCourse(String courseId) {
		Course course = new Course().setCourseId(courseId);
		//cDAO.insertCourse(course);
	}

	public void updateCourse(Course configCourse) {
		//cDAO.updateCourse(configCourse)
	}

	/*
	 * Remove student will find the student in the master list with the same ID number. The courses the student are in will be obtained from the student and the appropriate courses will be adjusted to show the removal 
	 * of that specific student. The student will then be removed from the master list.
	 */
	public void removeStudent(Student selected) {
		//sDAO.delete(selected);
		
	}
	
	public void addStudent(Integer studentId) {
		Student s = new Student().setStuId(studentId);
		//sDAO.insertStudent(s);
		
		
	}

	public void updateStudent(Student configStudent) {
		//sDAO.updateStudent(configStudent);
	}

	public List<Course> getClasses() {
		//cDAO.getAll();
		return null;
	}

	public List<Student> getStudents() {
		// sDAO.getAll();
		return null;
	}

	
}
