import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dell on 7/9/2017.
 */
public class ReceptionDashboard extends JFrame{
    private JPanel panel=new JPanel();
    private JButton studentEnrollButton=new JButton("StudentEnroll");
    private JButton courseDetailbutton=new JButton("CourseDetails");


    public ReceptionDashboard(){
        GridBagLayout gridBagLayout=new GridBagLayout();

        GridBagConstraints gbc =new GridBagConstraints();
        panel.setLayout(gridBagLayout);
        studentEnrollButton=new JButton("STUDENTS ENROLL");
        gbc.gridx=2;
        gbc.gridy=1;
        gbc.ipadx = 5;
        gbc.ipady = 2;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(studentEnrollButton,gbc);
        courseDetailbutton=new JButton("COURSE DETAILS");
        gbc.gridwidth = 1;
        gbc.gridx=2;
        gbc.gridy=7;
        gbc.ipadx = 6;
        gbc.ipady = 3;
        panel.add(courseDetailbutton,gbc);
        add(panel);
        setVisible(true);
        setSize(300,300);

        studentEnrollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StudentEnroll();
            }
        });

        courseDetailbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    new CourseDetail();
            }
        });
    }

    public static void main(String args []){
        new ReceptionDashboard();
    }
}
