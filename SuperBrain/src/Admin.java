import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aaaaa on 7/12/2017.
 */
public class Admin extends JFrame {
    private JPanel panel=new JPanel();
    private JButton AddCoursebutton= new JButton("addcourse");
   private JButton AddUserbutton=new JButton("adduser");
   private JButton EnrollStudentbutton;
    private JButton DeleteStudentbutton;
    private JButton UpdateUserbutton;
    private  JButton ViewStudentDetailsbutton;
    private JButton DeleteCoursebutton;
    private JButton Installmentbutton;
    private JButton ViewNormalUsersbutton;
    private JButton CancelInstallmentbutton;

    public Admin (){
        GridBagLayout gridBagLayout=new GridBagLayout();

        GridBagConstraints gbc =new GridBagConstraints();
        panel.setLayout(gridBagLayout);
        AddCoursebutton=new JButton("ADD COURSE");
        gbc.gridx=2;
        gbc.gridy=1;
        gbc.ipadx = 5;
        gbc.ipady = 2;
        gbc.gridwidth = 4;
        panel.add(AddCoursebutton,gbc);


        AddUserbutton=new JButton("ADD USER");
        gbc.gridx=2;
        gbc.gridy=2;
        gbc.ipadx = 5;
        gbc.ipady = 2;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(AddUserbutton,gbc);
        EnrollStudentbutton=new JButton("ENROLL STUDENT");
        gbc.gridx=4;
        gbc.gridy=2;
        gbc.ipadx = 5;
        gbc.ipady = 2;
        gbc.gridwidth = 4;

        panel.add(EnrollStudentbutton,gbc);
        DeleteStudentbutton=new JButton("DELETE STUDENT");
        gbc.gridx=3;
        gbc.gridy=3;
        gbc.ipadx = 5;
        gbc.ipady = 2;
        gbc.gridwidth = 4;

        panel.add(DeleteStudentbutton,gbc);
        UpdateUserbutton=new JButton("UPDATE USER");
        gbc.gridx=5;
        gbc.gridy=3;
        gbc.ipadx = 5;
        gbc.ipady = 2;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(UpdateUserbutton,gbc);
        ViewStudentDetailsbutton=new JButton("VIEW STUDENT DETAILS");
        gbc.gridx=4;
        gbc.gridy=4;
        gbc.ipadx = 5;
        gbc.ipady = 2;
        gbc.gridwidth = 4;

        panel.add(ViewStudentDetailsbutton,gbc);
        DeleteCoursebutton=new JButton("DELETE COURSE");
        gbc.gridx=6;
        gbc.gridy=4;
        gbc.ipadx = 5;
        gbc.ipady = 2;
        gbc.gridwidth = 4;

        panel.add(DeleteStudentbutton,gbc);
        Installmentbutton=new JButton("INSTALLMENT");
        gbc.gridx=5;
        gbc.gridy=5;
        gbc.ipadx = 5;
        gbc.ipady = 2;
        gbc.gridwidth = 4;

        panel.add(Installmentbutton,gbc);
        ViewNormalUsersbutton=new JButton("VIEW NORMAL USER");
        gbc.gridx=7;
        gbc.gridy=5;
        gbc.ipadx = 5;
        gbc.ipady = 2;
        gbc.gridwidth = 4;

        panel.add(ViewStudentDetailsbutton,gbc);
        CancelInstallmentbutton=new JButton("CANCEL INSTALLMENT");
        gbc.gridx=6;
        gbc.gridy=6;
        gbc.ipadx = 5;
        gbc.ipady = 2;
        gbc.gridwidth = 4;

        panel.add(CancelInstallmentbutton,gbc);
        add(panel);
        setVisible(true);
        setSize(300,300);

    }

      public static void main(String args []){
      new Admin();
      }}