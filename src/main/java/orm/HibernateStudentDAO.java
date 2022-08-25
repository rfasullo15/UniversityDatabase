package orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateStudentDAO implements StudentDAO {
	
	private final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
 
	private SessionFactory sessionFactory;	
	
	public HibernateStudentDAO() {
		 
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

	public List<Student> getAll() {
		Session session = sessionFactory.openSession();
		List<Student> result = session.createQuery("from Student").getResultList();
		return result;
	}

	public Student getStudentByStuId(Integer stuId) {
		Session session = sessionFactory.openSession();
		
		Student result = session.get(Student.class, stuId);

		return result;
	}

	public void insertStudent(Student s) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(s);
		transaction.commit();
		session.close();

	}

	public void deleteStudent(Student s) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(s);
		transaction.commit();
		session.close();

	}

	public void updateStudent(Student s) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(s);
		transaction.commit();
		session.close();

	}

	

}
