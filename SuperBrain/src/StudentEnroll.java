import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/11/2017.
 */
public class StudentEnroll extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton submitButton;
    private JLabel nameLabel;
    private JLabel ageLabel;
    private JLabel addressLabel;
    private JLabel sexLabel;
    private JLabel contactLabel;
    private JLabel courseLabel;
    private JLabel titleLabel;
    private JTextField name;
    private JTextField age;
    private JTextField address;
    private JTextField sex ;
    private JTextField contactno;
    private JTextField course;



    public StudentEnroll(){
        panel = new JPanel();
        GridBagLayout gridBagLayout=new GridBagLayout();
        GridBagConstraints gbc =new GridBagConstraints();
        panel.setLayout(gridBagLayout);


        nameLabel =new JLabel("Name");
        gbc.gridx=0;
        gbc.gridy=0;
        panel.add(nameLabel,gbc);

        addressLabel = new JLabel("Address");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(addressLabel,gbc);

        sexLabel = new JLabel("Sex");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(sexLabel,gbc);

        ageLabel = new JLabel("Age");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(ageLabel,gbc);


        contactLabel = new JLabel("Contact No.");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(contactLabel,gbc);

        courseLabel = new JLabel("Course");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(courseLabel,gbc);


        name=new JTextField(30);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.ipady = 10;
        panel.add(name,gbc);

        address=new JTextField(30);
        gbc.gridy++;
        gbc.gridy++;
        panel.add(address,gbc);

        sex=new JTextField(30);
        gbc.gridy++;
        gbc.gridy++;
        panel.add(sex,gbc);

        age=new JTextField(30);
        gbc.gridy++;
        gbc.gridy++;
        panel.add(age,gbc);

        contactno=new JTextField(30);
        gbc.gridy++;
        gbc.gridy++;
        panel.add(contactno,gbc);

        course=new JTextField(30);
        gbc.gridy++;
        gbc.gridy++;
        panel.add(course,gbc);

        submitButton = new JButton("Submit");
        gbc.gridy++;
        gbc.gridy++;
        gbc.gridy++;
        panel.add(submitButton);



        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        add(panel);

    }
    
}
