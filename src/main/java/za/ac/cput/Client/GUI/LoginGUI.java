package za.ac.cput.Client.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame implements ActionListener {

    private JLabel lblUsername;
    private JLabel lblPassword;
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JButton btnLogin;
    private JButton btnExit;

    public LoginGUI(){
        super("LOGIN");
        lblUsername = new JLabel("username");
        lblPassword = new JLabel("password");
        txtUsername = new JTextField();
        txtPassword = new JTextField();
        btnLogin = new JButton("Login");
        btnExit = new JButton("Exit");
    }

    public void setGUI(){
        this.setLayout(new GridLayout(3,2));

        this.add(lblUsername);
        this.add(lblPassword);
        this.add(txtUsername);
        this.add(txtPassword);
        this.add(btnLogin);
        this.add(btnExit);

        btnLogin.addActionListener(this);
        btnExit.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public boolean isValidUser(String username, String password) {

        String user = txtUsername.getText();
        String passwd = txtPassword.getText();
        boolean found = false;

        return found;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Login")) {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            if (isValidUser(username, password)) {
                JOptionPane.showMessageDialog(null, "Welcome. Login successful!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid user");
            }
        }
        else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new LoginGUI().setGUI();
    }

}
