package orm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.EventObject;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * An instance of a Controller class creates an instance of a View and and instance of a Model. The controller is the link between what the user sees and the collections of 
 * Students and Courses that are maintained by the model.
 */
public class Controller implements ActionListener{

	private View v; //Maintains what the user sees
	private Model m; //Maintains the collection of Students and Courses 
	private StudentEditor se;
	private CourseEditor ce;
	
	public Controller() {
		this.v = new View(this);
		this.m = new Model(this);
	}

	/*
	 * The actionPerformed method determined which event was triggered and then calls the appropriate method.
	 * 
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */

	public void actionPerformed(ActionEvent arg0) {
		Object src = arg0.getSource();

		if (src == v.getQuitMenu()) {
			quitButton();
		} else if (src == v.getBtnStuAdd()){
			studentAddButton();
		} else if (src == v.getBtnStuEdit()) {
			studentEditButton();
		} else if (src == v.getBtnStuRemove()) {
			studentRemoveButton();
		} else if (src == se.getBtnOK()){
			m.updateStudent(se.getConfigStudent());
			se.setVisible(false);
			se = null;
		} else if (src == se.getBtnCancel()) {
			se.setVisible(false);
			se = null;
		} else if (src == v.getBtnCoAdd()){
			courseAddButton();
		} else if (src == v.getBtnCoEdit()) {
			courseEditButton();
		} else if (src == v.getBtnCoRemove()) {
			courseRemoveButton();
		} else if (src == ce.getBtnOK()){
			m.updateCourse(ce.getConfigCourse());
		} else {
			System.out.println("Whoopsie Daisy");
		}
	}
	
	private void courseAddButton() {
		String courseId = (String) JOptionPane.showInputDialog(v, "Enter Course ID:", "Add Course", JOptionPane.PLAIN_MESSAGE, null, null, ""); 
		m.addCourse(courseId);
		
		ce = new CourseEditor(new Course().setCourseId(courseId), this);
		
		
	}

	private void courseEditButton() {
		Course selected = v.getCourseList().getSelectedValue();
		m.updateCourse(selected);
		
	}

	private void courseRemoveButton() {
		Course selected = v.getCourseList().getSelectedValue();
		m.removeCourse(selected);
		
	}

	/*
	 * studentRemoveButton is triggered whenever the remove button in the student pane is triggered. This method will prompt the user if they are sure they want to remove the 
	 * currently selected student. If yes, the student is removed from the lists in the model and the list models are updated in the view.
	 */

	private void studentRemoveButton() {
		Student selected = v.getStudentList().getSelectedValue();
		m.removeStudent(selected);

	}

	/*
	 * studentEditButton is triggered whenever the edit button in the student pane is triggered. This method will cause the View to open up a StudentEditor frame and then pass the information gained from the user 
	 * into the model so the model can edit the current student. 
	 */
	private void studentEditButton() {
		Student selected = v.getStudentList().getSelectedValue();
		se = new StudentEditor(selected, this);

	}

	/*
	 * studentAddButton is triggered whenever the add button in the student pane is triggered. This method will cause the View to open up a blank StudentEditor frame and then pass the information gained from the user
	 *  into the model to be turned into a student object and integrated into both the class lists and the student list.
	 */
	private void studentAddButton() {
		Integer studentId = Integer.valueOf((String) JOptionPane.showInputDialog(v, "Enter Student ID:", "Add Student", JOptionPane.PLAIN_MESSAGE, null, null, "")); 
		m.addStudent(studentId);
		
		se = new StudentEditor(new Student().setStuId(studentId), this);
	}	

	/*
	 * quitButton will prompt the user if they are sure they want to quit. If yes, the system will exit.
	 */
	public void quitButton() {
		int ans = JOptionPane.showConfirmDialog(null, "Are you sure? \n Any unsaved data will be lost!", "Are you sure?", JOptionPane.YES_NO_OPTION);
		if (ans == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	/*
	 * updateInfo passes the current student list and class list from the model into the JLists in the view.
	 */
	public void updateInfo() {
		v.setStudentListModel(m.getStudents());
		v.setCourseListModel(m.getClasses());
		
	}

}

