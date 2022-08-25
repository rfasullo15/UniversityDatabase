package orm;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;

/*
 * An instance of a Student editor will allow the user to enter or change information about a student. If the new student flag is true, the student ID can be changed, if the new student flag is false, the student ID
 * cannot be changed.
 */
public class StudentEditor extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private Controller c;
	private Integer stuId;
	private JButton btnOK;
	private JButton btnCancel;
	public StudentEditor(Student stu, Controller c) {
		this.c = c;
		this.stuId = stu.getStuId();
		
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Student ID: ");
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(stuId.toString());
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField = new JTextField();
		if(stu.getName() != null) {
		textField.setText(stu.getName().split(" ")[0]);
		}
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Middle Name");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 1;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_1 = new JTextField();
		if(stu.getName() != null) {
			textField_1.setText(stu.getName().split(" ")[1]);
		}
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Last Name");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 2;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_2 = new JTextField();
		if(stu.getName() != null) {
			textField_2.setText(stu.getName().split(" ")[2]);
		}
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 3;
		panel_1.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_3 = new JTextField();
		if(stu.getName() != null) {
			textField_3.setText(stu.getEmail());
		}
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		panel_1.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Box Number");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 4;
		panel_1.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_4 = new JTextField();
		if(stu.getName() != null) {
			textField_4.setText(String.valueOf(stu.getBox()));
		}
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 4;
		panel_1.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Classification");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 5;
		panel_1.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_5 = new JTextField();
		if(stu.getName() != null) {
			textField_5.setText(stu.getClassif());
		}
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 5;
		panel_1.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Courses");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 6;
		panel_1.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 6;
		panel_1.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		/*
		 * The select courses button is used so that the user can only enroll the student in a course that actually exists in the course collection.
		 */
		JButton btnCoSelect = new JButton("Select Courses");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 7;
		panel_1.add(btnCoSelect, gbc_btnNewButton_2);
		
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
	public Student getConfigStudent() {
		Student s = new Student();
		s.setStuId(this.stuId).setBox(Integer.valueOf(textField_4.getText())).setClassif(textField_5.getText()).setEmail(textField_3.getText())
		.setName(textField.getText() + " " + textField_1.getText() + " " + textField_2.getText());
		
		return s;
	}
	

}
