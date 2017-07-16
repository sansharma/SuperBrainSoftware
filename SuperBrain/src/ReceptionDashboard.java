import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dell on 7/9/2017.
 */
public class ReceptionDashboard extends JFrame{
    private JPanel panel=new JPanel();
    private JButton studentEnrollButton;
    private JButton courseDetailbutton;
    private JButton courseViewButton;

    public ReceptionDashboard(){
        GridBagLayout gridBagLayout=new GridBagLayout();

        GridBagConstraints gbc =new GridBagConstraints();
        panel.setLayout(gridBagLayout);
        studentEnrollButton=new JButton(" ENROLL STUDENTS");
        gbc.gridx=2;
        gbc.gridy=1;
        gbc.ipadx = 5;
        gbc.ipady = 2;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(studentEnrollButton,gbc);
        courseDetailbutton=new JButton("ADD COURSE");
        gbc.gridwidth = 1;
        gbc.gridx=2;
        gbc.gridy=7;
        gbc.ipadx = 6;
        gbc.ipady = 3;
        panel.add(courseDetailbutton,gbc);

        courseViewButton=new JButton("VIEW COURSE");
        gbc.gridwidth = 1;
        gbc.gridx=2;
        gbc.gridy=12;
        gbc.ipadx = 6;
        gbc.ipady = 3;
        panel.add(courseViewButton,gbc);

        add(panel);
        setVisible(true);
        setSize(300,300);

        studentEnrollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EnrollStudent();
            }
        });

        courseDetailbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    new AddCourse();
            }
        });

        courseViewButton.addActionListener(new ActionListener() {
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
