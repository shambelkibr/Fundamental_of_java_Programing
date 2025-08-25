import javax.swing.*;
import java.awt.event.*;

public class student_Registration {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(500, 600);
        frame.setLayout(null); 
        
        // Student ID
        JLabel idLabel = new JLabel("Student Id:");
        idLabel.setBounds(50, 20, 100, 25);
        JTextField idField = new JTextField();
        idField.setBounds(160, 20, 250, 25);
        
        // First Name
        JLabel fnameLabel = new JLabel("First Name:");
        fnameLabel.setBounds(50, 50, 100, 25);
        JTextField fnameField = new JTextField();
        fnameField.setBounds(160, 50, 250, 25);
        
        // Father Name
        JLabel lnameLabel = new JLabel("Father Name:");
        lnameLabel.setBounds(50, 80, 100, 25);
        JTextField lnameField = new JTextField();
        lnameField.setBounds(160, 80, 250, 25);
        
        // Age (using JSpinner)
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50, 110, 100, 25);
        SpinnerNumberModel ageModel = new SpinnerNumberModel(18, 1, 100, 1); 
        JSpinner ageSpinner = new JSpinner(ageModel);
        ageSpinner.setBounds(160, 110, 100, 25);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 150, 100, 25);

        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(160, 150, 70, 25);

        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(240, 150, 80, 25);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        
        // Department
        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setBounds(50, 250, 100, 25);

        String[] departments = {"SE", "IT", "CS", "DS", "IS"};
        JComboBox<String> deptBox = new JComboBox<>(departments);
        deptBox.setBounds(160, 250, 250, 25);
        
        // Subjects
        JLabel subjectLabel = new JLabel("Subjects:");
        subjectLabel.setBounds(50, 290, 100, 25);

        JCheckBox dsCheckBox = new JCheckBox("Data Structure");
        dsCheckBox.setBounds(160, 290, 130, 25);

        JCheckBox oopCheckBox = new JCheckBox("OOP");
        oopCheckBox.setBounds(300, 290, 80, 25);

        JCheckBox statCheckBox = new JCheckBox("Stat");
        statCheckBox.setBounds(390, 290, 70, 25);

        JCheckBox dbCheckBox = new JCheckBox("Database");
        dbCheckBox.setBounds(160, 320, 130, 25);

        JCheckBox oosadCheckBox = new JCheckBox("OOSAD");
        oosadCheckBox.setBounds(300, 320, 80, 25);
        
        JCheckBox coaCheckBox = new JCheckBox("COA");
        coaCheckBox.setBounds(390, 320, 70, 25);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(180, 430, 120, 35);

        // Add components to frame
        frame.add(idLabel);
        frame.add(idField);
        frame.add(fnameLabel);
        frame.add(fnameField);
        frame.add(lnameLabel);
        frame.add(lnameField);
        frame.add(ageLabel);
        frame.add(ageSpinner);
        frame.add(genderLabel);
        frame.add(maleButton);
        frame.add(femaleButton);
        frame.add(deptLabel);
        frame.add(deptBox);
        frame.add(subjectLabel);
        frame.add(dsCheckBox);
        frame.add(oopCheckBox);
        frame.add(dbCheckBox);
        frame.add(oosadCheckBox);
        frame.add(submitButton);
        frame.add(statCheckBox);
        frame.add(coaCheckBox);

        // Submit Button Action
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show success message
                JOptionPane.showMessageDialog(frame, 
                    "Registration Submitted Successfully!", 
                    "Success", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}