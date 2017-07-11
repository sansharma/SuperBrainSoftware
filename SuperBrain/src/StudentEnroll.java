import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/11/2017.
 */
public class StudentEnroll extends JFrame {
    private JLabel label=new JLabel();
    private JTextField ID,username,password;
    private JLabel jID,jUsername,JPassword;
    private JLabel titleLabel=new JLabel();
    private JPanel panel=new JPanel();
    private JPasswordField Id=new JPasswordField();
    private JTextField Username=new JTextField();
    private JTextField Password=new JTextField();
    GridBagLayout gridBagLayout=new GridBagLayout();

    public StudentEnroll(){
        GridBagConstraints gbc =new GridBagConstraints();
        panel.setLayout(gridBagLayout);
        titleLabel=new JLabel("ID");
        gbc.gridx=1;
        gbc.gridy=1;
        panel.add(titleLabel,gbc);
        Id=new JPasswordField(30);
        gbc.gridx=2;
        gbc.gridy=1;
        panel.add(Id,gbc);

        titleLabel=new JLabel("Username");
        titleLabel.setSize(400,300);
        gbc.gridx=4;
        gbc.gridy=1;
        panel.add(titleLabel,gbc);

        titleLabel=new JLabel("Password");
        titleLabel.setSize(300,300);
        gbc.gridx=5;
        gbc.gridy=1;

        panel.add(titleLabel,gbc);
        add(panel);
        setVisible(true);

    }
    
}
