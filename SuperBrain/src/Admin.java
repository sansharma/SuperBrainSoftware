import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aaaaa on 7/12/2017.
 */
public class Admin extends JFrame {
    private JPanel panel;
    private JButton AddCoursebutton;
    private JButton EnrollStudentbutton;
    private JButton CancelInstallmentbutton;
    private  JButton ViewStudentDetailsbutton;
    private JButton InstallmenPaymenttbutton;
    private JButton AddUserbutton;
    private JButton DeleteStudentbutton;
    private JButton UpdateUserbutton;
    private JButton DeleteCoursebutton;
    private JButton ViewNormalUsersbutton;


    public Admin (){
        panel = new JPanel();
        GridBagLayout gridBagLayout=new GridBagLayout();
        GridBagConstraints gbc =new GridBagConstraints();
        panel.setLayout(gridBagLayout);


        AddCoursebutton=new JButton("ADD COURSE");
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(AddCoursebutton,gbc);

        EnrollStudentbutton=new JButton("ENROLL STUDENT");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(EnrollStudentbutton,gbc);

        CancelInstallmentbutton=new JButton("CANCEL INSTALLMENT");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(CancelInstallmentbutton,gbc);

        ViewStudentDetailsbutton=new JButton("VIEW STUDENT DETAILS");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(ViewStudentDetailsbutton,gbc);

        InstallmenPaymenttbutton=new JButton("INSTALLMENT PAYMENT");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(InstallmenPaymenttbutton,gbc);



        AddUserbutton=new JButton("ADD USER");
        gbc.gridy = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.ipadx = 6;
        gbc.ipady = 3;
        panel.add(AddCoursebutton,gbc);

        DeleteStudentbutton=new JButton("DELETE STUDENT");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(DeleteStudentbutton,gbc);

        UpdateUserbutton=new JButton("UPDATE USER");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(UpdateUserbutton,gbc);

        DeleteCoursebutton=new JButton("DELETE COURSE");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(DeleteStudentbutton,gbc);

        ViewNormalUsersbutton=new JButton("VIEW NORMAL USER");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(ViewStudentDetailsbutton,gbc);


        setVisible(true);
        setSize(300,300);
        add(panel);
    }

      public static void main(String args []){
        new Admin();
      }}