package orm;

import java.util.List;

public interface StudentDAO {
	
	public abstract List<Student> getAll();
	public abstract Student getStudentByStuId(Integer stuId);
	public abstract void insertStudent(Student s);
	public abstract void deleteStudent(Student s);
	public abstract void updateStudent(Student s);
	
}
