package orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateCourseDAO implements CourseDAO {
	
	private final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();

	private SessionFactory sessionFactory;		 

	public HibernateCourseDAO() {

		try {
			sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
			System.out.println("session factory good.");
		}
		catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
			// so destroy it manually.
			System.err.println("problem building session factory. "+e.getMessage());
			
			StandardServiceRegistryBuilder.destroy( registry );
		}
	}

	public List<Course> getAll() {
		Session session = sessionFactory.openSession();
		List<Course> result = session.createQuery("from Course").getResultList();
		return result;
	}

	public Course getCourseByCourseId(String courseId) {
		Session session = sessionFactory.openSession();
		Course result = session.get(Course.class, courseId);
		return result;
	}

	public List<Course> getNotFullCourses() {
		Session session = sessionFactory.openSession();
		
		List<Course> result = session.createQuery("from Course where currsize < limit").getResultList();
		return result;
	}

	public void insertCourse(Course c) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(c);
		transaction.commit();
		session.close();

	}

	public void deleteCourse(Course c) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(c);
		transaction.commit();
		session.close();

	}

	public void updateStudent(Course c) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(c);
		transaction.commit();
		session.close();

	}

	

}
