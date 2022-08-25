package orm;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.ListModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JRadioButton;

/**
 * An instance of a View creates a JFrame that houses the user interface for the Student-Classes model. There are three tabs in the frame, one for students, one for courses and one that is used to generate reports about 
 * relationships between the two sets of data. The view can also generate children windows of the types StudentEditor and CourseEditor. 
 * @author 90rfa
 *
 */
public class View extends JFrame {
	private Controller c;
	
	//JMenu buttons
	private JMenuItem newMenu;
	private JMenuItem openMenu;
	private JMenuItem saveMenu;
	private JMenuItem quitMenu;
	
	//Student Buttons
	private JButton btnStuAdd;
	private JButton btnStuRemove;
	private JButton btnStuEdit;
	
	//Course Buttons
	private JButton btnCoAdd;
	private JButton btnCoRemove;
	private JButton btnCoEdit;
	
	
	private JList<Student> studentList;
	private JList<Course> courseList;

	private JButton btnReport;

	
	public View(Controller c) {
		
		this.c = c;
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Students", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{429, 0, 0};
		gbl_panel.rowHeights = new int[]{79, 84, 70, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		studentList = new JList<Student>();
		studentList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 3;
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;
		panel.add(studentList, gbc_list);
		
		btnStuAdd = new JButton("Add");
		btnStuAdd.addActionListener(c);
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 0, 5, 0);
		gbc_btnAdd.gridx = 1;
		gbc_btnAdd.gridy = 0;
		panel.add(btnStuAdd, gbc_btnAdd);
		
		btnStuRemove = new JButton("Remove");
		btnStuRemove.addActionListener(c);
		GridBagConstraints gbc_btnRemove = new GridBagConstraints();
		gbc_btnRemove.insets = new Insets(0, 0, 5, 0);
		gbc_btnRemove.gridx = 1;
		gbc_btnRemove.gridy = 1;
		panel.add(btnStuRemove, gbc_btnRemove);
		
		btnStuEdit = new JButton("Edit");
		btnStuEdit.addActionListener(c);
		GridBagConstraints gbc_btnEdit = new GridBagConstraints();
		gbc_btnEdit.gridx = 1;
		gbc_btnEdit.gridy = 2;
		panel.add(btnStuEdit, gbc_btnEdit);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Courses", null, panel_1, null);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{425, 72, 0};
		gbl_panel_1.rowHeights = new int[]{79, 73, 81, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		courseList = new JList<Course>();
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.gridheight = 3;
		gbc_list_1.insets = new Insets(0, 0, 5, 5);
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.gridx = 0;
		gbc_list_1.gridy = 0;
		panel_1.add(courseList, gbc_list_1);
		
		btnCoAdd = new JButton("Add");
		btnCoAdd.addActionListener(c);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 0;
		panel_1.add(btnCoAdd, gbc_btnNewButton);
		
		btnCoRemove = new JButton("Remove");
		btnCoRemove.addActionListener(c);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 1;
		panel_1.add(btnCoRemove, gbc_btnNewButton_1);
		
		btnCoEdit = new JButton("Edit");
		btnCoEdit.addActionListener(c);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 2;
		panel_1.add(btnCoEdit, gbc_btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Reports", null, panel_2, null);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{162, 159, 176, 0};
		gbl_panel_2.rowHeights = new int[]{29, 23, 0, 23, 0, 23, 0, 23, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblSelectAReport = new JLabel("  Select a Report:");
		GridBagConstraints gbc_lblSelectAReport = new GridBagConstraints();
		gbc_lblSelectAReport.anchor = GridBagConstraints.WEST;
		gbc_lblSelectAReport.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectAReport.gridx = 0;
		gbc_lblSelectAReport.gridy = 0;
		panel_2.add(lblSelectAReport, gbc_lblSelectAReport);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Students in Course Report");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 1;
		gbc_rdbtnNewRadioButton.gridy = 1;
		panel_2.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Courses Not Full Report");
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 1;
		gbc_rdbtnNewRadioButton_1.gridy = 3;
		panel_2.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Courses for Student Report");
		GridBagConstraints gbc_rdbtnNewRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_2.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_2.gridx = 1;
		gbc_rdbtnNewRadioButton_2.gridy = 5;
		panel_2.add(rdbtnNewRadioButton_2, gbc_rdbtnNewRadioButton_2);
		
		btnReport = new JButton("Run Report");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_3.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_3.gridx = 1;
		gbc_btnNewButton_3.gridy = 7;
		panel_2.add(btnReport, gbc_btnNewButton_3);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		newMenu = new JMenuItem("New");
		newMenu.addActionListener(c);
		mnFile.add(newMenu);
		
		
		openMenu = new JMenuItem("Open");
		openMenu.addActionListener(c);
		mnFile.add(openMenu);
		
		saveMenu = new JMenuItem("Save");
		saveMenu.addActionListener(c);
		mnFile.add(saveMenu);
		
		quitMenu = new JMenuItem("Quit");
		quitMenu.addActionListener(c);
		mnFile.add(quitMenu);
		
		this.pack();
		this.setVisible(true);
	}
	public JList<Student> getStudentList() {
		return studentList;
	}
	public JList<Course> getCourseList(){
		return courseList;
	}
	public Controller getC() {
		return c;
	}
	public JButton getBtnStuAdd() {
		return btnStuAdd;
	}
	public JButton getBtnStuRemove() {
		return btnStuRemove;
	}
	public JButton getBtnStuEdit() {
		return btnStuEdit;
	}
	public JMenuItem getNewMenu() {
		return newMenu;
	}
	public JMenuItem getOpenMenu() {
		return openMenu;
	}
	public JMenuItem getSaveMenu() {
		return saveMenu;
	}
	public JMenuItem getQuitMenu() {
		return quitMenu;
	}
	public JButton getBtnCoAdd() {
		return btnCoAdd;
	}
	public JButton getBtnCoRemove() {
		return btnCoRemove;
	}
	public JButton getBtnCoEdit() {
		return btnCoEdit;
	}
	public JButton getBtnReport() {
		return btnReport;
	}
	public void setStudentListModel(List<Student> stoods) {
		this.studentList.setModel((ListModel<Student>) stoods);
		
	}
	public void setCourseListModel(List<Course> classes) {
		this.courseList.setModel((ListModel<Course>) classes);
	}

}
