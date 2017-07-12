import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/11/2017.
 */
public class StudentEnroll extends JFrame {
    private JPanel Panel;
    private JLabel label=new JLabel();
    private JButton studentEnrollbutton;
    private JTextField Name,Age,Address,Sex,ContactNo,Course;
    private JLabel jName,jAge,jAddress,jSex,jContactNo,jCourse;
    private JLabel titleLabel=new JLabel();
    private JPanel panel=new JPanel();
    private JTextField name = new JTextField();
    private JTextField age = new JTextField();
    private JTextField address = new JTextField();
    private JTextField sex = new JTextField();
    private JTextField contactno = new JTextField();
    private JTextField course = new JTextField();


    public StudentEnroll(){
        GridBagLayout gridBagLayout=new GridBagLayout();
        GridBagConstraints gbc =new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;

        gbc.weightx = 1;
        gbc.weighty = 1;
        panel.setLayout(gridBagLayout);

        titleLabel=new JLabel("Name");
        gbc.gridx=0;
        gbc.gridy=0;
        panel.add(titleLabel,gbc);
        name=new JTextField(30);
        gbc.gridx=2;
        gbc.gridy=1;
        panel.add(name,gbc);

        titleLabel=new JLabel("Address");
        titleLabel.setSize(400,300);
        gbc.gridx=4;
        gbc.gridy=1;
        panel.add(titleLabel,gbc);
        address=new JTextField(30);
        gbc.gridx=2;
        gbc.gridy=1;
        panel.add(address,gbc);


        titleLabel=new JLabel("Age");
        titleLabel.setSize(300,300);
        gbc.gridx=5;
        gbc.gridy=1;
        panel.add(titleLabel,gbc);
        age=new JTextField(30);
        gbc.gridx=2;
        gbc.gridy=1;
        panel.add(age,gbc);

        titleLabel=new JLabel("Sex");
        titleLabel.setSize(300,300);
        gbc.gridx=5;
        gbc.gridy=1;
        panel.add(titleLabel,gbc);
        sex=new JTextField(30);
        gbc.gridx=2;
        gbc.gridy=1;
        panel.add(sex,gbc);

        titleLabel=new JLabel("Contact No.");
        titleLabel.setSize(300,300);
        gbc.gridx=5;
        gbc.gridy=1;
        panel.add(titleLabel,gbc);
        contactno=new JTextField(30);
        gbc.gridx=2;
        gbc.gridy=1;
        panel.add(contactno,gbc);

        titleLabel=new JLabel(" Course Of Study");
        titleLabel.setSize(300,300);
        gbc.gridx=5;
        gbc.gridy=1;
        panel.add(titleLabel,gbc);
        course=new JTextField(30);
        gbc.gridx=2;
        gbc.gridy=1;
        panel.add(course,gbc);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        add(panel);

    }
    
}
