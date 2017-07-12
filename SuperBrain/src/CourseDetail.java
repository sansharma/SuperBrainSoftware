import com.sun.org.glassfish.gmbal.NameValue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sandesh on 7/10/2017.
 */
public class CourseDetail extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton submitbutton;
    private JLabel namelabel;
    private JLabel teacherlabel;
    private JLabel durationlabel;
    private JLabel feelabel;
    private JTextField name;
    private JTextField teacher;
    private JTextField duration;
    private JTextField fee;


    public CourseDetail() {
        panel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(gridBagLayout);


        namelabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(namelabel,gbc);

        teacherlabel = new JLabel("Teacher:");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(teacherlabel,gbc);

        durationlabel = new JLabel("Duration:");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(durationlabel, gbc);

        feelabel = new JLabel("Fee:");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(feelabel, gbc);

        name=new JTextField(30);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.ipady = 10;
        panel.add(name,gbc);

        teacher=new JTextField(30);
        gbc.gridy++;
        gbc.gridy++;
        panel.add(teacher,gbc);

        duration=new JTextField(30);
        gbc.gridy++;
        gbc.gridy++;
        panel.add(duration,gbc);

        fee=new JTextField(30);
        gbc.gridy++;
        gbc.gridy++;
        panel.add(fee,gbc);

        submitbutton = new JButton("Submit");
        gbc.gridy++;
        gbc.gridy++;
        gbc.gridy++;
        panel.add(submitbutton);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        add(panel);


        submitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Name= namelabel.getText();
                String Teacher=teacherlabel.getText();
                String Duration=durationlabel.getText();
                String Fee=feelabel.getText();

                DBConnect db=new DBConnect();
                if(db.insertCourse(Name,Teacher,Duration,Fee)){
                    dispose();
                }
                else{

                }

            }
        });



    }


}