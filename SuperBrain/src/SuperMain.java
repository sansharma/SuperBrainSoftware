import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sandesh on 7/10/2017.
 */
public class SuperMain extends JFrame {
    JPanel panel;
    private JTextField username;
    private JPasswordField password;
    private JLabel jusername;
    private JLabel jpassword;
    private JLabel titleLabel;
    private JLabel loginLabel;
    private JButton login;
    private JButton clear;
    private JTextField td = new JTextField();
    private JPasswordField pd = new JPasswordField();
    private Image backgroundImage;



    public SuperMain(){
        panel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();

        panel.setLayout(gridBagLayout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;

        gbc.weightx = 1;
        gbc.weighty = 1;
        titleLabel = new JLabel("SuperBrain MIS");
        titleLabel.setFont(new Font("Courier New", Font.BOLD, 40));
        panel.add(titleLabel,gbc);

        td = new JTextField(20);
        gbc.gridx = 3;
        gbc.gridy = 9;
        panel.add(td,gbc);

        pd = new JPasswordField (20);
        gbc.gridx = 3;
        gbc.gridy = 11;
        panel.add(pd,gbc);

        login = new JButton("login");
        gbc.gridx = 3;
        gbc.gridy = 13;
        panel.add(login,gbc);

        clear = new JButton("clear");
        gbc.gridx = 4;
        gbc.gridy = 13;
        panel.add(clear,gbc);

        loginLabel = new JLabel("Login");
        loginLabel.setFont(new Font("Courier New", Font.PLAIN, 30));
        gbc.gridx = 3;
        gbc.gridy = 5;
        panel.add(loginLabel,gbc);

        loginLabel = new JLabel("Username:");
        gbc.gridx = 2;
        gbc.gridy = 9;
        panel.add(loginLabel,gbc);
        loginLabel.setFont(new Font("Courier New", Font.ITALIC, 20));
        username = new JTextField();


        loginLabel = new JLabel("Password:");
        gbc.gridx = 2;
        gbc.gridy = 11;
        panel.add(loginLabel,gbc);
        loginLabel.setFont(new Font("Courier New", Font.ITALIC, 20));
        password = new JPasswordField();

        panel.setBackground(Color.BLUE);


        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usernameValue = td.getText();
                String passwordValue = pd.getText();
                //System.out.println("Inside action listener");
                System.out.println(usernameValue);
                System.out.println(passwordValue);

                DBConnect db = new DBConnect();
                db.setConnection();
                if(db.checkCredentials(usernameValue,passwordValue)){
                    dispose();
                    new ReceptionDashboard();
                }
                else{
                    loginLabel.setText("Invalid Username or Password");
                }



            }


        });
        setTitle("Login Form");

//        setBounds(100, 200, 1000, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        add(panel);
    }
    public static void main(String args[]){
        System.out.println("Test Commit");
        System.out.println("Test Commit From Pranesh");
    }
}
