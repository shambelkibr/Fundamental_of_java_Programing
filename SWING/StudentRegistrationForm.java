import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {
    // Form components
    private JTextField fnameField, lnameField, departmentField, yearField, usernameField;
    private JPasswordField passwordField;
    private JButton submitButton, resetButton;

    public StudentRegistrationForm() {
        // Frame setup
        setTitle("Student Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create panel and layout
        JPanel panel = new JPanel(new GridLayout(8, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add components
        panel.add(new JLabel("First Name:"));
        fnameField = new JTextField();
        panel.add(fnameField);

        panel.add(new JLabel("Last Name:"));
        lnameField = new JTextField();
        panel.add(lnameField);

        panel.add(new JLabel("Department:"));
        departmentField = new JTextField();
        panel.add(departmentField);

        panel.add(new JLabel("Year:"));
        yearField = new JTextField();
        panel.add(yearField);

        panel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        panel.add(usernameField);

        panel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        panel.add(submitButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        panel.add(resetButton);

        // Add panel to frame
        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Validate fields before submission
            if (validateFields()) {
                String info = "Registration Details:\n";
                info += "First Name: " + fnameField.getText() + "\n";
                info += "Last Name: " + lnameField.getText() + "\n";
                info += "Department: " + departmentField.getText() + "\n";
                info += "Year: " + yearField.getText() + "\n";
                info += "Username: " + usernameField.getText() + "\n";
                info += "Password: " + new String(passwordField.getPassword()) + "\n";

                JOptionPane.showMessageDialog(this, info, "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
                
                // Clear fields after successful submission
                resetFields();
                
                // Show additional success message
                JOptionPane.showMessageDialog(this, 
                    "Registration submitted successfully!\nThank you for registering.", 
                    "Success", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == resetButton) {
            resetFields();
            JOptionPane.showMessageDialog(this, 
                "All fields have been cleared.", 
                "Form Reset", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private boolean validateFields() {
        if (fnameField.getText().trim().isEmpty() ||
            lnameField.getText().trim().isEmpty() ||
            departmentField.getText().trim().isEmpty() ||
            yearField.getText().trim().isEmpty() ||
            usernameField.getText().trim().isEmpty() ||
            passwordField.getPassword().length == 0) {
            
            JOptionPane.showMessageDialog(this, 
                "Please fill in all fields.", 
                "Validation Error", 
                JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void resetFields() {
        fnameField.setText("");
        lnameField.setText("");
        departmentField.setText("");
        yearField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        fnameField.requestFocus(); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StudentRegistrationForm();
        });
    }
}