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
        //gbc.gridwidth = 1;
        //gbc.ipadx = 2;
        //gbc.ipady = 3;
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
        gbc.gridx = 3;
        gbc.gridy = 0;
       // gbc.gridwidth = 2;
        panel.add(AddUserbutton,gbc);

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
        panel.add(DeleteCoursebutton,gbc);

        ViewNormalUsersbutton=new JButton("VIEW NORMAL USER");
        gbc.gridy++;
        gbc.gridy++;
        panel.add(ViewNormalUsersbutton,gbc);


        setVisible(true);
        setSize(300,300);
        add(panel);
        AddCoursebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddCourse();
            }
        });
        EnrollStudentbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EnrollStudent();
            }
        });
        CancelInstallmentbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CancelInstallment();
            }
        });
        DeleteCoursebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DeleteCourse();
            }
        });
        DeleteStudentbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DeleteStudent();
            }
        });
        UpdateUserbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdateUser();
            }
        });
        ViewNormalUsersbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewNormalUser();
            }
        });
//        InstallmenPaymenttbutton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new ();
//            }
//        });
        CancelInstallmentbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CancelInstallment();
            }
        });
//        ViewStudentDetailsbutton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new ();
//            }
//        });

    }

      public static void main(String args []){
        new Admin();
      }}