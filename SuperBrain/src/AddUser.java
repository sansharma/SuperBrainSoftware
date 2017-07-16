import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sandesh on 7/15/2017.
 */
public class AddUser extends JFrame {
        private JPanel panel;
        private JLabel userLabel;
        private JLabel passwordLabel;
        private JTextField userField;
        private JTextField passwordField;
        private JButton submitbutton;

        public AddUser(){
        panel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(gridBagLayout);


        userLabel = new JLabel("UserName:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(userLabel,gbc);

        passwordLabel = new JLabel("Password");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(passwordLabel,gbc);

        userField = new JTextField();
        userField.setColumns(20);
        gbc.gridx = 3;
        gbc.gridy = 0;
        panel.add(userField,gbc);

        passwordField = new JTextField();
        passwordField.setColumns(20);
        gbc.gridy++;
        gbc.gridy++;
        panel.add(passwordField,gbc);

        submitbutton = new JButton("Add");
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridy++;
        gbc.gridy++;
        panel.add(submitbutton,gbc);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        add(panel);


        submitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = passwordField.getText();

                DBConnect db=new DBConnect();
                if(db.addUser(username,password)){
                    dispose();
                }
            }
        });



    }

}
