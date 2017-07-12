import com.sun.org.glassfish.gmbal.NameValue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sandesh on 7/10/2017.
 */
public class CourseDetail extends JFrame {
    private JLabel label = new JLabel();
    private JButton submitbutton=new JButton();
    private JTextField ID, Name, Teacher, Duration, Fee;
    private JLabel jID, jName, JTeacher, JDuration, JFee;
    private JLabel titleLabel = new JLabel();
    private JPanel panel = new JPanel();
    private JPasswordField Id = new JPasswordField();
    private JTextField Nam = new JTextField();
    private JTextField Teach = new JTextField();
    private JTextField Dura = new JTextField();
    private JTextField fee = new JTextField();
    GridBagLayout gridBagLayout = new GridBagLayout();

    public CourseDetail() {
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(gridBagLayout);
         submitbutton=new JButton("submit");
         gbc.gridx=12;
         gbc.gridy=13;
         panel.add(submitbutton,gbc);

        titleLabel = new JLabel("Name");
        titleLabel.setSize(200, 300);
        gbc.gridx = 3;
        gbc.gridy = 1;
        panel.add(titleLabel, gbc);
        Nam = new JTextField(30);
        gbc.gridx = 4;
        gbc.gridy = 1;
        panel.add(Nam);
        titleLabel = new JLabel("Teacher");
        titleLabel.setSize(500, 300);
        gbc.gridx = 5;
        gbc.gridy = 3;
        panel.add(titleLabel, gbc);
        Teach = new JTextField(30);
        gbc.gridx = 6;
        gbc.gridy = 3;
        panel.add(Teach, gbc);
        titleLabel = new JLabel("Duration");
        titleLabel.setSize(400, 300);
        gbc.gridx = 8;
        gbc.gridy = 4;
        panel.add(titleLabel, gbc);

        Dura = new JTextField(30);
        gbc.gridx = 10;
        gbc.gridy = 4;
        panel.add(Dura);

        titleLabel = new JLabel("Fee");
        titleLabel.setSize(300, 300);
        gbc.gridx = 12;
        gbc.gridy = 5;
        panel.add(titleLabel, gbc);
        fee = new JTextField(30);
        gbc.gridx = 14;
        gbc.gridy = 5;
        panel.add(fee, gbc);
        submitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Name= jName.getText();
                String Teacher=JTeacher.getText();
                String Duration=JDuration.getText();
                String Fee=JFee.getText();
                System.out.println(Name);
                System.out.println(Teacher);
                System.out.println(Duration);
                System.out.println(Fee);

                DBConnect db=new DBConnect();
                if(db.insertCourse(Name,Teacher,Duration,Fee)){
                    dispose();
                }
                else{

                }

            }
        });

        add(panel);
        setVisible(true);
        setSize(300, 300);


    }


}