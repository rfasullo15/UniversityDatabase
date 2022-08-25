package orm;

import java.util.List;

public interface CourseDAO {
	
	public abstract List<Course> getAll();
	public abstract Course getCourseByCourseId(String courseId);
	public abstract List<Course> getNotFullCourses();
	public abstract void insertCourse(Course c);
	public abstract void deleteCourse(Course c);
	public abstract void updateStudent(Course c);
}
