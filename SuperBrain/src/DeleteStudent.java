import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Sandesh on 7/15/2017.
 */
public class DeleteStudent extends JFrame {
    private JComboBox comboBox;
    private DBConnect dbConnect;
    private ResultSet rs;
    private JPanel panel;
    private JButton deleteButton;


    public DeleteStudent(){
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        dbConnect = new DBConnect();
        ResultSet rs = dbConnect.fetchStudent();

        try {
            int i=0;
            rs.last();
            int row = rs.getRow();
            rs.beforeFirst();
            //System.out.println(row);
            String[] student = new String[row];
            while(rs.next()){
                 student[i] = rs.getString("name");
                 i++;
            }
            comboBox = new JComboBox<String>(student);
            comboBox.setSelectedIndex(2);


        } catch (SQLException e) {
            e.printStackTrace();
        }

        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentName = (String)comboBox.getSelectedItem();
                if(dbConnect.deleteStudent(studentName)){
                    dispose();
                }
            }
        });

        panel.add(comboBox,BorderLayout.NORTH);
        panel.add(deleteButton,BorderLayout.SOUTH);
        add(panel);
        setVisible(true);
        setSize(300,300);
    }
}
