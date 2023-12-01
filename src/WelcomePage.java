import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");
    JLabel welcomeLabel1 = new JLabel("New GUI page");
    WelcomePage(String userID){
        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        welcomeLabel.setText("Hello " + userID + "!");

        welcomeLabel1.setBounds(125,150,200,35);
        welcomeLabel1.setFont(new Font(null, Font.PLAIN, 25));

        frame.add(welcomeLabel);
        frame.add(welcomeLabel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
