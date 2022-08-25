package orm;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CourseEditor extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private Controller c;
	private String courseId;
	private JButton btnOK;
	private JButton btnCancel;
	private JTextField textField_7;
	private JTextField textField_8;
	public CourseEditor(Course course, Controller c) {
		this.c = c;
		this.courseId = course.getCourseId();

		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		JPanel panel = new JPanel();
		getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("Course ID: ");
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(course.toString());
		panel.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);

		JLabel lblNewLabel_2 = new JLabel("Name");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);

		textField = new JTextField();
		if(course.getName() != null) {
			textField.setText(course.getName());
		}
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Description");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 3;
		panel_1.add(lblNewLabel_5, gbc_lblNewLabel_5);

		textField_3 = new JTextField();
		if(course.getDescription() != null) {
			textField_3.setText(course.getDescription());
		}
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		panel_1.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Schedule");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 4;
		panel_1.add(lblNewLabel_6, gbc_lblNewLabel_6);

		textField_4 = new JTextField();
		if(course.getName() != null) {
			textField_4.setText(course.getTimes());
		}
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 4;
		panel_1.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Room");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 5;
		panel_1.add(lblNewLabel_7, gbc_lblNewLabel_7);

		textField_5 = new JTextField();
		if(course.getName() != null) {
			textField_5.setText(course.getRoom());
		}
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 5;
		panel_1.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Seats");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 6;
		panel_1.add(lblNewLabel_8, gbc_lblNewLabel_8);

		textField_6 = new JTextField();
		if(course.getName() != null) {
			textField_6.setText(String.valueOf(course.getLimit()));
		}
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 6;
		panel_1.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Current Size");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 7;
		panel_1.add(lblNewLabel_8, gbc_lblNewLabel_8);

		textField_7 = new JTextField();
		if(course.getName() != null) {
			textField_6.setText(String.valueOf(course.getCurrsize()));
		}
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 7;
		panel_1.add(textField_7, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("ProdId");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 7;
		panel_1.add(lblNewLabel_8, gbc_lblNewLabel_8);

		textField_8 = new JTextField();
		if(course.getName() != null) {
			textField_6.setText(String.valueOf(course.getProfessor()));
		}
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 7;
		panel_1.add(textField_8, gbc_textField_6);
		textField_6.setColumns(10);


		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2);

		btnOK = new JButton("OK");
		btnOK.addActionListener(c);
		panel_2.add(btnOK);

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(c);
		panel_2.add(btnCancel);

		this.pack();
		this.setVisible(true);
	}

	public JButton getBtnOK() {
		return btnOK;
	}
	public JButton getBtnCancel() {
		return btnCancel;
	}
	public Course getConfigCourse() {
		Course s = new Course();
		s.setCourseId(this.courseId).setName(textField_1.getText()).setDescription(textField_2.getText()).setTimes(textField_3.getText())
		.setRoom(textField_4.getText()).setLimit(Integer.valueOf(textField_5.getText())).setProfessor(Integer.valueOf(textField_6.getText()))
		.setCurrsize(Integer.valueOf(textField_7.getText()));

		return s;
	}
}
