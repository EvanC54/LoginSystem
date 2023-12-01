import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    //Creation of JFrame, Buttons, and textFields
    JFrame frame = new JFrame();
    JButton loginBtn = new JButton("Login");
    JButton resetBtn = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();


    //Creation of Labels for the user's Id, password, and login successful or not
    JLabel userIdLabel = new JLabel("userID");
    JLabel userPasswordLabel = new JLabel("password");
    JLabel messageLabel = new JLabel("");
    HashMap<String, String> logininfo = new HashMap<>();

    LoginPage(HashMap<String, String> loginInfoOrignial) {
        logininfo = loginInfoOrignial;
        //setting label coordinates and sizing
        userIdLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);
        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        //Id and password field bounds
        userIdField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        //Login Button
        loginBtn.setBounds(125, 200, 100, 25);
        loginBtn.addActionListener(this);
        loginBtn.setFocusable(false);
        //Reset Button
        resetBtn.setBounds(230, 200, 100, 25);
        resetBtn.addActionListener(this);
        resetBtn.setFocusable(false);

        //Creating JFrame and adding all components
        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(loginBtn);
        frame.add(resetBtn);
        //JFrame details
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Statement For Reset Button
        if (e.getSource() == resetBtn) {
            userIdField.setText("");
            userPasswordField.setText("");
        }
        //Statement For Login Button
        if (e.getSource() == loginBtn) {
            String userID = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            //Valid Login Info
            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successful!");
                    frame.dispose(); //rid of the login frame
                    WelcomePage welcomePage = new WelcomePage(userID);
                }
                //Incorrect Login Info
                else {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Password Incorrect!");
                }
            }
            //Statement For Incorrect Username
            else {
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Username not found!");
            }
        }
    }
}