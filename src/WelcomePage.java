import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomejlable = new JLabel("Hello!!");

    WelcomePage(String userID){

        welcomejlable.setBounds(0,0,200,35);
        welcomejlable.setFont(new Font(null,Font.PLAIN,25));
        welcomejlable.setText("Hello,"+userID);

        frame.add(welcomejlable);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
