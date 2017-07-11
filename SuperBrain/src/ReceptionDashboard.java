import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/9/2017.
 */
public class ReceptionDashboard extends JFrame{
    private JPanel panel=new JPanel();
    private JButton button=new JButton("StudentEnroll");
    private JButton button2=new JButton("CourseDetails");


    public ReceptionDashboard(){
        GridBagLayout gridBagLayout=new GridBagLayout();

        GridBagConstraints gbc =new GridBagConstraints();
        panel.setLayout(gridBagLayout);
        button=new JButton("STUDENTS ENROLL");
        gbc.gridx=2;
        gbc.gridy=1;
        gbc.ipadx = 5;
        gbc.ipady = 2;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(button,gbc);
        button2=new JButton("COURSE DETAILS");
        gbc.gridwidth = 1;
        gbc.gridx=2;
        gbc.gridy=7;
        gbc.ipadx = 6;
        gbc.ipady = 3;
        panel.add(button2,gbc);
        add(panel);
        setVisible(true);
        setSize(300,300);
    }

    public static void main(String args []){
        new ReceptionDashboard();
    }
}
